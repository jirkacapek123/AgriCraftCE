package com.agricraft.agricraft.common.adapter;

import com.agricraft.agricraft.api.AgriApi;
import com.agricraft.agricraft.api.adapter.AgriAdapter;
import com.agricraft.agricraft.api.genetic.AgriGenome;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import java.util.Optional;

public class GenomeAdapter implements AgriAdapter<AgriGenome> {

	@Override
	public boolean accepts(Object obj) {
		if (obj instanceof ItemLike itemLike) {
			return accepts(new ItemStack(itemLike));
		}
		if (obj instanceof ItemStack itemStack) {
			return match(itemStack);
		}
		return false;
	}

	@Override
	public Optional<AgriGenome> valueOf(Object obj) {
		if (obj instanceof ItemLike itemLike) {
			return valueOf(new ItemStack(itemLike));
		}
		if (obj instanceof ItemStack itemStack) {
			return convert(itemStack);
		}
		return Optional.empty();
	}

	public boolean match(ItemStack itemStack) {
		return AgriApi.get().getPlantRegistry().map(registry -> registry.stream().anyMatch(plant -> plant.seeds().anyMatch(seed -> seed.isVariant(itemStack) && seed.overridePlanting()))).orElse(false);
	}

	public Optional<AgriGenome> convert(ItemStack itemStack) {
		return AgriApi.get().getPlantRegistry().flatMap(registry -> registry.stream()
				.filter(plant -> plant.seeds().anyMatch(seed -> seed.isVariant(itemStack) && seed.overridePlanting()))
				.findFirst()
				.map(AgriGenome::new));

	}

}
