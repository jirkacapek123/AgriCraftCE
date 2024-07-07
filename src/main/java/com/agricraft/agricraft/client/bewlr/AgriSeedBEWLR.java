package com.agricraft.agricraft.client.bewlr;

import com.agricraft.agricraft.api.AgriClientApi;
import com.agricraft.agricraft.common.item.AgriSeedItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.client.RenderTypeHelper;

/**
 * Renderer for the agricraft seed item
 */
public class AgriSeedBEWLR extends BlockEntityWithoutLevelRenderer {

	public static final AgriSeedBEWLR INSTANCE = new AgriSeedBEWLR();
	private static final String DEFAULT_SEED = "agricraft:unknown";

	public AgriSeedBEWLR() {
		super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
	}

	@Override
	public void renderByItem(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
		String plant = AgriSeedItem.getSpecies(stack);
		BakedModel seedModel = AgriClientApi.get().getSeedModel(plant);
		// render the item using the computed model
		// https://gist.github.com/XFactHD/11ccae6a54da62909caf6d555cd4d8b9
		ItemRenderer renderer = Minecraft.getInstance().getItemRenderer();

		poseStack.popPose();
		poseStack.pushPose();

		seedModel = seedModel.applyTransform(itemDisplayContext, poseStack, isLeftHand(itemDisplayContext));
		poseStack.translate(-.5, -.5, -.5);

		boolean glint = stack.hasFoil();
		for (RenderType type : seedModel.getRenderTypes(stack, true)) {
			type = RenderTypeHelper.getEntityRenderType(type, true);
			VertexConsumer consumer = ItemRenderer.getFoilBuffer(buffer, type, true, glint);
			renderer.renderModelLists(seedModel, stack, packedLight, packedOverlay, poseStack, consumer);
		}
	}
	private static boolean isLeftHand(ItemDisplayContext itemDisplayContext) {
		return itemDisplayContext == ItemDisplayContext.FIRST_PERSON_LEFT_HAND || itemDisplayContext == ItemDisplayContext.THIRD_PERSON_LEFT_HAND;
	}

}
