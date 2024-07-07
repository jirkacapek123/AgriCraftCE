package com.agricraft.agricraft.common.commands;

import com.agricraft.agricraft.api.AgriApi;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

/**
 * Command to dump agricraft registries
 */
public class DumpRegistriesCommand {

	public static void register(CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext context) {
		dispatcher.register(Commands.literal("agricraft_dump")
				.requires(commandSourceStack -> commandSourceStack.hasPermission(2))
				.then(Commands.literal("plants").executes(commandContext -> DumpRegistriesCommand.dumpPlants()))
				.then(Commands.literal("soils").executes(commandContext -> DumpRegistriesCommand.dumpSoils()))
				.then(Commands.literal("mutations").executes(commandContext -> DumpRegistriesCommand.dumpMutations()))
				.then(Commands.literal("fertilizers").executes(commandContext -> DumpRegistriesCommand.dumpFertilizers()))
				.executes(commandContext -> DumpRegistriesCommand.dumpAllRegistries())
		);

	}

	public static int dumpAllRegistries() {
		dumpPlants();
		dumpSoils();
		dumpMutations();
		dumpFertilizers();
		return 1;
	}

	public static int dumpPlants() {
		System.out.println("Plants:");
		AgriApi.get().getPlantRegistry().ifPresent(registry -> registry.keySet().forEach(System.out::println));
		return 1;
	}
	public static int dumpSoils() {
		System.out.println("Soils:");
		AgriApi.get().getSoilRegistry().ifPresent(registry -> registry.keySet().forEach(System.out::println));
		return 1;
	}
	public static int dumpMutations() {
		System.out.println("Mutations:");
		AgriApi.get().getMutationRegistry().ifPresent(registry -> registry.keySet().forEach(System.out::println));
		return 1;
	}
	public static int dumpFertilizers() {
		System.out.println("Fertilizers:");
		AgriApi.get().getFertilizerRegistry().ifPresent(registry -> registry.keySet().forEach(System.out::println));
		return 1;
	}

}
