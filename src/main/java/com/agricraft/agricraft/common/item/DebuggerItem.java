package com.agricraft.agricraft.common.item;

import com.agricraft.agricraft.common.block.entity.CropBlockEntity;
import com.agricraft.agricraft.common.block.entity.SeedAnalyzerBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

public class DebuggerItem extends Item {

	public DebuggerItem(Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		Level level = context.getLevel();
		BlockPos pos = context.getClickedPos();
		Player player = context.getPlayer();
		System.out.println("side: " + (level.isClientSide?"client":"server"));
		if (level.getBlockEntity(pos) instanceof SeedAnalyzerBlockEntity analyzer) {
			System.out.println("  tag: " + analyzer.saveWithoutMetadata(level.registryAccess()));
			System.out.println("  hasSeed: " + analyzer.hasSeed());
			if (analyzer.hasSeed()) {
				System.out.println("    seed: " + analyzer.getSeed() + " " + analyzer.getSeed().save(player.registryAccess()));
			}
			System.out.println("  hasJournal: " + analyzer.hasJournal());
			if (analyzer.hasJournal()) {
				System.out.println("    journal: " + analyzer.getJournal() + " " + analyzer.getJournal().save(player.registryAccess()));
			}
		}
		if (level.getBlockEntity(pos) instanceof CropBlockEntity crop) {
			System.out.println("  tag: " + crop.saveWithoutMetadata(level.registryAccess()));
			System.out.println("  plant id: " + crop.getPlantId());
			System.out.println("  plant: " + crop.getPlant());
		}
		return super.useOn(context);
	}

	//	private static final List<DebugMode> MODES = ImmutableList.of(
//			new DebugModeCheckSoil(),
//			new DebugModeCoreInfo(),
//			new DebugModeCheckIrrigationComponent(),
//			new DebugModeFillIrrigationComponent(),
//			new DebugModeDrainIrrigationComponent(),
//			new DebugModeBonemeal(),
//			new DebugModeDiffLight(),
//			new DebugModeGreenHouse()
//	);


//	@Override
//	protected List<DebugMode> getDebugModes() {
//		return MODES;
//	}
}
