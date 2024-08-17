package com.agricraft.agricraft.datagen;

import com.agricraft.agricraft.api.AgriApi;
import com.agricraft.agricraft.api.codecs.AgriMutation;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class MutationsDatagen {

	public static void registerMutations(BootstrapContext<AgriMutation> context) {
		mc(context, "allium", AgriMutation.builder().child("minecraft:allium").parents("minecraft:poppy", "minecraft:blue_orchid").chance(0.75).build());
		mc(context, "azure_bluet", AgriMutation.builder().child("minecraft:azure_bluet").parents("minecraft:dandelion", "minecraft:lily_of_the_valley").chance(0.75).build());
		mc(context, "bamboo", AgriMutation.builder().child("minecraft:bamboo").parents("minecraft:sugar_cane", "minecraft:cactus").chance(0.5).build());
		mc(context, "blue_orchid", AgriMutation.builder().child("minecraft:blue_orchid").parents("minecraft:poppy", "minecraft:dandelion").chance(0.75).build());
		mc(context, "brown_mushroom", AgriMutation.builder().child("minecraft:brown_mushroom").parents("minecraft:potato", "minecraft:carrot").chance(0.5).build());
		mc(context, "cactus", AgriMutation.builder().child("minecraft:cactus").parents("minecraft:sugar_cane", "minecraft:potato").chance(0.5).build());
		mc(context, "carrot", AgriMutation.builder().child("minecraft:carrot").parents("minecraft:wheat", "minecraft:potato").chance(0.75).build());
		mc(context, "cornflower", AgriMutation.builder().child("minecraft:cornflower").parents("minecraft:blue_orchid", "minecraft:lily_of_the_valley").chance(0.75).build());
		mc(context, "crimson_fungus", AgriMutation.builder().child("minecraft:crimson_fungus").parents("minecraft:nether_wart", "minecraft:poppy").chance(0.75).build());
		mc(context, "dandelion", AgriMutation.builder().child("minecraft:dandelion").parents("minecraft:pumpkin", "minecraft:wheat").chance(0.75).build());
		mc(context, "kelp", AgriMutation.builder().child("minecraft:kelp").parents("minecraft:seagrass", "minecraft:bamboo").chance(0.5).build());
		mc(context, "lily_of_the_valley", AgriMutation.builder().child("minecraft:lily_of_the_valley").parents("minecraft:white_tulip", "minecraft:oxeye_daisy").chance(0.75).build());
		mc(context, "melon", AgriMutation.builder().child("minecraft:melon").parents("minecraft:sugar_cane", "minecraft:pumpkin").chance(0.25).build());
		mc(context, "orange_tulip", AgriMutation.builder().child("minecraft:orange_tulip").parents("minecraft:oxeye_daisy", "minecraft:blue_orchid").chance(0.75).build());
		mc(context, "oxeye_daisy", AgriMutation.builder().child("minecraft:oxeye_daisy").parents("minecraft:dandelion", "minecraft:blue_orchid").chance(0.75).build());
		mc(context, "pink_tulip", AgriMutation.builder().child("minecraft:pink_tulip").parents("minecraft:allium", "minecraft:dandelion").chance(0.75).build());
		mc(context, "poppy", AgriMutation.builder().child("minecraft:poppy").parents("minecraft:sugar_cane", "minecraft:melon").chance(0.75).build());
		mc(context, "pumpkin", AgriMutation.builder().child("minecraft:pumpkin").parents("minecraft:carrot", "minecraft:potato").chance(0.25).build());
		mc(context, "red_mushroom", AgriMutation.builder().child("minecraft:red_mushroom").parents("minecraft:potato", "minecraft:carrot").chance(0.5).build());
		mc(context, "red_tulip", AgriMutation.builder().child("minecraft:red_tulip").parents("minecraft:poppy", "minecraft:allium").chance(0.75).build());
		mc(context, "seagrass", AgriMutation.builder().child("minecraft:seagrass").parents("minecraft:wheat", "minecraft:bamboo").chance(0.5).build());
		mc(context, "sea_pickle", AgriMutation.builder().child("minecraft:sea_pickle").parents("minecraft:seagrass", "minecraft:carrot").chance(0.5).build());
		mc(context, "sugar_cane", AgriMutation.builder().child("minecraft:sugar_cane").parents("minecraft:wheat", "minecraft:beetroot").chance(0.5).build());
		mc(context, "sweet_berries", AgriMutation.builder().child("minecraft:sweet_berries").parents("minecraft:sugar_cane", "minecraft:beetroot").chance(0.75).build());
		mc(context, "torchflower", AgriMutation.builder().child("minecraft:torchflower").parents("minecraft:red_tulip", "minecraft:cornflower").chance(0.75).build());
		mc(context, "warped_fungus", AgriMutation.builder().child("minecraft:warped_fungus").parents("minecraft:nether_wart", "minecraft:blue_orchid").chance(0.75).build());
		mc(context, "white_tulip", AgriMutation.builder().child("minecraft:white_tulip").parents("minecraft:oxeye_daisy", "minecraft:dandelion").chance(0.75).build());
		mc(context, "wither_rose", AgriMutation.builder().child("minecraft:wither_rose").parents("minecraft:cornflower", "minecraft:poppy").chance(0.75).build());

		agricraft(context, "amathyllis", AgriMutation.builder().child("agricraft:amathyllis").parents("agricraft:lapender", "agricraft:redstodendron").chance(0.25).build());
		agricraft(context, "aurigold", AgriMutation.builder().child("agricraft:aurigold").parents("agricraft:ferranium", "agricraft:redstodendron").chance(0.25).build());
		agricraft(context, "carbonation", AgriMutation.builder().child("agricraft:carbonation").parents("agricraft:lapender", "minecraft:wither_rose").chance(0.25).build());
		agricraft(context, "cuprosia", AgriMutation.builder().child("agricraft:cuprosia").parents("agricraft:ferranium", "minecraft:carrot").chance(0.25).build());
		agricraft(context, "diamahlia", AgriMutation.builder().child("agricraft:diamahlia").parents("agricraft:amathyllis", "agricraft:nitor_wart").chance(0.25).build());
		agricraft(context, "emeryllis", AgriMutation.builder().child("agricraft:emeryllis").parents("agricraft:amathyllis", "agricraft:quartzanthemum").chance(1.0).build());
		agricraft(context, "ferranium", AgriMutation.builder().child("agricraft:ferranium").parents("minecraft:melon", "minecraft:pumpkin").chance(0.5).build());
		agricraft(context, "jaslumine", AgriMutation.builder().child("agricraft:jaslumine").parents("agricraft:ferranium", "minecraft:potato").chance(0.25).build());
		agricraft(context, "lapender", AgriMutation.builder().child("agricraft:lapender").parents("agricraft:ferranium", "minecraft:cornflower").chance(0.25).build());
		agricraft(context, "nethereed", AgriMutation.builder().child("agricraft:nethereed").parents("agricraft:emeryllis", "agricraft:diamahlia").chance(0.25).build());
		agricraft(context, "niccissus", AgriMutation.builder().child("agricraft:niccissus").parents("agricraft:ferranium", "minecraft:white_tulip").chance(0.25).build());
		agricraft(context, "nitor_wart", AgriMutation.builder().child("agricraft:nitor_wart").parents("agricraft:aurigold", "minecraft:nether_wart").chance(0.75).build());
		agricraft(context, "osmonium", AgriMutation.builder().child("agricraft:osmonium").parents("agricraft:ferranium", "agricraft:quartzanthemum").chance(0.25).build());
		agricraft(context, "petinia", AgriMutation.builder().child("agricraft:petinia").parents("agricraft:ferranium", "minecraft:wheat").chance(0.25).build());
		agricraft(context, "platiolus", AgriMutation.builder().child("agricraft:platiolus").parents("agricraft:ferranium", "agricraft:aurigold").chance(0.25).build());
		agricraft(context, "plombean", AgriMutation.builder().child("agricraft:plombean").parents("agricraft:ferranium", "minecraft:brown_mushroom").chance(0.25).build());
		agricraft(context, "quartzanthemum", AgriMutation.builder().child("agricraft:quartzanthemum").parents("agricraft:redstodendron", "agricraft:nitor_wart").chance(0.5).build());
		agricraft(context, "redstodendron", AgriMutation.builder().child("agricraft:redstodendron").parents("agricraft:ferranium", "agricraft:lapender").chance(1.0).build());
	}

	public static void registerBiomesOPlenty(BootstrapContext<AgriMutation> context) {
		r(context, "biomesoplenty", "burning_blossom", new AgriMutation("biomesoplenty:burning_blossom", "minecraft:orange_tulip", "minecraft:red_tulip", 0.5));
		r(context, "biomesoplenty", "glowflower", new AgriMutation("biomesoplenty:glowflower", "minecraft:lily_of_the_valley", "minecraft:blue_orchid", 0.5));
		r(context, "biomesoplenty", "glowshroom", new AgriMutation("biomesoplenty:glowshroom", "minecraft:brown_mushroom", "minecraft:blue_orchid", 0.5));
		r(context, "biomesoplenty", "lavender", new AgriMutation("biomesoplenty:lavender", "minecraft:azure_bluet", "biomesoplenty:violet", 0.5));
		r(context, "biomesoplenty", "orange_cosmos", new AgriMutation("biomesoplenty:orange_cosmos", "minecraft:oxeye_daisy", "minecraft:carrot", 0.5));
		r(context, "biomesoplenty", "pink_daffodil", new AgriMutation("biomesoplenty:pink_daffodil", "minecraft:pink_tulip", "minecraft:azure_bluet", 0.5));
		r(context, "biomesoplenty", "pink_hibiscus", new AgriMutation("biomesoplenty:pink_hibiscus", "minecraft:pink_tulip", "minecraft:seagrass", 0.5));
		r(context, "biomesoplenty", "rose", new AgriMutation("biomesoplenty:rose", "minecraft:poppy", "minecraft:sweet_berries", 0.5));
		r(context, "biomesoplenty", "toadstool", new AgriMutation("biomesoplenty:toadstool", "minecraft:brown_mushroom", "minecraft:carrot", 0.5));
		r(context, "biomesoplenty", "violet", new AgriMutation("biomesoplenty:violet", "minecraft:poppy", "minecraft:cornflower", 0.5));
		r(context, "biomesoplenty", "white_lavender", new AgriMutation("biomesoplenty:white_lavender", "minecraft:azure_bluet", "biomesoplenty:lavender", 0.5));
		r(context, "biomesoplenty", "wilted_lily", new AgriMutation("biomesoplenty:wilted_lily", "minecraft:lily_of_the_valley", "minecraft:brown_mushroom", 0.5));
	}

	public static void registerCroptopia(BootstrapContext<AgriMutation> context) {
		croptopia(context, "artichoke", "croptopia:asparagus", "croptopia:lettuce");
		croptopia(context, "asparagus", "minecraft:carrot", "croptopia:corn");
		croptopia(context, "barley", "minecraft:sugar_cane", "minecraft:wheat");
		croptopia(context, "basil", "minecraft:sugar_cane", "minecraft:potato");
		croptopia(context, "bellpepper", "croptopia:basil", "croptopia:chile_pepper");
		croptopia(context, "blackbean", "minecraft:pumpkin", "minecraft:potato");
		croptopia(context, "blackberry", "croptopia:strawberry", "croptopia:soybean");
		croptopia(context, "blueberry", "croptopia:strawberry", "croptopia:soybean");
		croptopia(context, "broccoli", "croptopia:lettuce", "croptopia:soybean");
		croptopia(context, "cabbage", "croptopia:onion", "minecraft:seagrass");
		croptopia(context, "cantaloupe", "minecraft:melon", "croptopia:strawberry");
		croptopia(context, "cauliflower", "croptopia:cabbage", "croptopia:lettuce");
		croptopia(context, "celery", "minecraft:wheat", "croptopia:soybean");
		croptopia(context, "chile_pepper", "croptopia:tomato", "croptopia:onion");
		croptopia(context, "coffee", "minecraft:sugar_cane", "croptopia:greenbean");
		croptopia(context, "corn", "croptopia:barley", "croptopia:rice");
		croptopia(context, "cranberry", "croptopia:blueberry", "croptopia:grape");
		croptopia(context, "cucumber", "minecraft:sea_pickle", "croptopia:soybean");
		croptopia(context, "currant", "croptopia:blackberry", "croptopia:strawberry");
		croptopia(context, "eggplant", "croptopia:zucchini", "croptopia:tomato");
		croptopia(context, "elderberry", "croptopia:blackberry", "croptopia:currant");
		croptopia(context, "garlic", "croptopia:onion", "croptopia:ginger");
		croptopia(context, "ginger", "croptopia:peanut", "minecraft:bamboo");
		croptopia(context, "grape", "croptopia:blueberry", "croptopia:cantaloupe");
		croptopia(context, "greenbean", "minecraft:pumpkin", "minecraft:potato");
		croptopia(context, "greenonion", "croptopia:onion", "croptopia:onion");
		croptopia(context, "honeydew", "minecraft:melon", "croptopia:oat");
		croptopia(context, "hops", "croptopia:barley", "croptopia:cauliflower");
		croptopia(context, "kale", "croptopia:cabbage", "croptopia:cauliflower");
		croptopia(context, "kiwi", "croptopia:cantaloupe", "croptopia:strawberry");
		croptopia(context, "leek", "croptopia:celery", "minecraft:carrot");
		croptopia(context, "lettuce", "croptopia:soybean", "croptopia:celery");
		croptopia(context, "mustard", "croptopia:chile_pepper", "croptopia:greenbean");
		croptopia(context, "oat", "croptopia:corn", "croptopia:rice");
		croptopia(context, "olive", "croptopia:blackberry", "croptopia:greenbean");
		croptopia(context, "onion", "minecraft:allium", "minecraft:potato");
		croptopia(context, "peanut", "croptopia:greenbean", "croptopia:corn");
		croptopia(context, "pineapple", "croptopia:corn", "croptopia:spinach");
		croptopia(context, "radish", "minecraft:beetroot", "minecraft:carrot");
		croptopia(context, "raspberry", "croptopia:strawberry", "croptopia:soybean");
		croptopia(context, "rhubarb", "minecraft:sugar_cane", "croptopia:lettuce");
		croptopia(context, "rice", "croptopia:barley", "minecraft:wheat");
		croptopia(context, "rutabaga", "minecraft:beetroot", "croptopia:turnip");
		croptopia(context, "saguaro", "minecraft:sugar_cane", "minecraft:cactus");
		croptopia(context, "soybean", "croptopia:greenbean", "croptopia:rice");
		croptopia(context, "spinach", "croptopia:lettuce", "minecraft:cactus");
		croptopia(context, "squash", "croptopia:eggplant", "minecraft:pumpkin");
		croptopia(context, "strawberry", "minecraft:sweet_berries", "croptopia:soybean");
		croptopia(context, "sweetpotato", "minecraft:sugar_cane", "minecraft:potato");
		croptopia(context, "tomatillo", "croptopia:tomato", "croptopia:cucumber");
		croptopia(context, "tomato", "croptopia:sweetpotato", "minecraft:carrot");
		croptopia(context, "turmeric", "croptopia:ginger", "croptopia:rice");
		croptopia(context, "turnip", "minecraft:beetroot", "croptopia:radish");
		croptopia(context, "vanilla", "minecraft:sugar_cane", "croptopia:turmeric");
		croptopia(context, "yam", "croptopia:sweetpotato", "minecraft:potato");
		croptopia(context, "zucchini", "minecraft:pumpkin", "croptopia:cucumber");
	}

	public static void registerFarmersDelight(BootstrapContext<AgriMutation> context) {
		r(context, "farmersdelight", "cabbage", new AgriMutation("farmersdelight:cabbage", "farmersdelight:onion", "minecraft:seagrass", 0.5));
		r(context, "farmersdelight", "onion", new AgriMutation("farmersdelight:onion", "minecraft:allium", "minecraft:potato", 0.5));
		r(context, "farmersdelight", "rice", new AgriMutation("farmersdelight:rice", "minecraft:seagrass", "minecraft:wheat", 0.5));
		r(context, "farmersdelight", "tomato", new AgriMutation("farmersdelight:tomato", "minecraft:wheat", "minecraft:beetroot", 0.5));
	}

	public static void registerImmersiveEngineering(BootstrapContext<AgriMutation> context) {
		r(context, "immersiveengineering", "hemp", new AgriMutation("immersiveengineering:hemp", "minecraft:pumpkin", "minecraft:wheat", 0.5));
	}

	public static void registerPamsHarvestCraft2(BootstrapContext<AgriMutation> context) {
		pamhc2crops(context, "agave", "minecraft:cactus", "pamhc2crops:pineapple");
		pamhc2crops(context, "amaranth", "pamhc2crops:chilipepper", "pamhc2crops:cranberry");
		pamhc2crops(context, "arrowroot", "pamhc2crops:cassava", "pamhc2crops:taro");
		pamhc2crops(context, "artichoke", "pamhc2crops:asparagus", "pamhc2crops:lettuce");
		pamhc2crops(context, "asparagus", "pamhc2crops:scallion", "pamhc2crops:corn");
		pamhc2crops(context, "barley", "minecraft:wheat", "minecraft:sugar_cane");
		pamhc2crops(context, "bean", "minecraft:pumpkin", "minecraft:potato");
		pamhc2crops(context, "bellpepper", "pamhc2crops:chilipepper", "pamhc2crops:spiceleaf");
		pamhc2crops(context, "blackberry", "pamhc2crops:strawberry", "pamhc2crops:soybean");
		pamhc2crops(context, "blueberry", "pamhc2crops:strawberry", "pamhc2crops:soybean");
		pamhc2crops(context, "broccoli", "pamhc2crops:lettuce", "pamhc2crops:soybean");
		pamhc2crops(context, "brusselsprout", "pamhc2crops:cabbage", "pamhc2crops:peas");
		pamhc2crops(context, "cabbage", "pamhc2crops:broccoli", "pamhc2crops:lettuce");
		pamhc2crops(context, "cactusfruit", "pamhc2crops:kiwi", "minecraft:cactus");
		pamhc2crops(context, "candleberry", "pamhc2crops:cactusfruit", "pamhc2crops:grape");
		pamhc2crops(context, "cantaloupe", "minecraft:melon", "pamhc2crops:strawberry");
		pamhc2crops(context, "cassava", "pamhc2crops:taro", "pamhc2crops:turnip");
		pamhc2crops(context, "cauliflower", "pamhc2crops:cabbage", "pamhc2crops:lettuce");
		pamhc2crops(context, "celery", "minecraft:wheat", "pamhc2crops:soybean");
		pamhc2crops(context, "chickpea", "pamhc2crops:peas", "pamhc2crops:cabbage");
		pamhc2crops(context, "chilipepper", "pamhc2crops:tomato", "pamhc2crops:onion");
		pamhc2crops(context, "coffeebean", "pamhc2crops:bean", "minecraft:sugar_cane");
		pamhc2crops(context, "corn", "pamhc2crops:barley", "pamhc2crops:rye");
		pamhc2crops(context, "cotton", "pamhc2crops:barley", "pamhc2crops:soybean");
		pamhc2crops(context, "cranberry", "pamhc2crops:blueberry", "pamhc2crops:grape");
		pamhc2crops(context, "cucumber", "pamhc2crops:peas", "pamhc2crops:okra");
		pamhc2crops(context, "eggplant", "pamhc2crops:zucchini", "pamhc2crops:tomato");
		pamhc2crops(context, "elderberry", "pamhc2crops:huckleberry", "minecraft:sugar_cane");
		pamhc2crops(context, "flax", "minecraft:wheat", "pamhc2crops:rye");
		pamhc2crops(context, "garlic", "pamhc2crops:onion", "pamhc2crops:ginger");
		pamhc2crops(context, "ginger", "pamhc2crops:mustardseeds", "pamhc2crops:peanut");
		pamhc2crops(context, "grape", "pamhc2crops:blueberry", "pamhc2crops:cantaloupe");
		pamhc2crops(context, "greengrape", "pamhc2crops:grape", "pamhc2crops:grape");
		pamhc2crops(context, "huckleberry", "pamhc2crops:blackberry", "pamhc2crops:raspberry");
		pamhc2crops(context, "jicama", "pamhc2crops:peas", "pamhc2crops:kohlrabi");
		pamhc2crops(context, "juniperberry", "pamhc2crops:huckleberry", "pamhc2crops:raspberry");
		pamhc2crops(context, "jute", "pamhc2crops:kenaf", "minecraft:wheat");
		pamhc2crops(context, "kale", "pamhc2crops:cauliflower", "pamhc2crops:kohlrabi");
		pamhc2crops(context, "kenaf", "pamhc2crops:barley", "minecraft:sugar_cane");
		pamhc2crops(context, "kiwi", "pamhc2crops:cantaloupe", "pamhc2crops:strawberry");
		pamhc2crops(context, "kohlrabi", "pamhc2crops:cauliflower", "minecraft:carrot");
		pamhc2crops(context, "leek", "pamhc2crops:scallion", "pamhc2crops:celery");
		pamhc2crops(context, "lentil", "pamhc2crops:rice", "pamhc2crops:quinoa");
		pamhc2crops(context, "lettuce", "pamhc2crops:soybean", "pamhc2crops:celery");
		pamhc2crops(context, "millet", "minecraft:wheat", "pamhc2crops:barley");
		pamhc2crops(context, "mulberry", "pamhc2crops:blueberry", "minecraft:sweet_berries");
		pamhc2crops(context, "mustardseeds", "pamhc2crops:chilipepper", "pamhc2crops:bean");
		pamhc2crops(context, "oats", "pamhc2crops:corn", "pamhc2crops:rice");
		pamhc2crops(context, "okra", "pamhc2crops:bean", "pamhc2crops:leek");
		pamhc2crops(context, "onion", "pamhc2crops:celery", "pamhc2crops:brusselsprout");
		pamhc2crops(context, "parsnip", "minecraft:carrot", "minecraft:beetroot");
		pamhc2crops(context, "peanut", "pamhc2crops:peas", "pamhc2crops:corn");
		pamhc2crops(context, "peas", "pamhc2crops:soybean", "pamhc2crops:okra");
		pamhc2crops(context, "pineapple", "pamhc2crops:rice", "pamhc2crops:cantaloupe");
		pamhc2crops(context, "quinoa", "pamhc2crops:rice", "minecraft:wheat");
		pamhc2crops(context, "radish", "pamhc2crops:tomato", "pamhc2crops:brusselsprout");
		pamhc2crops(context, "raspberry", "pamhc2crops:strawberry", "pamhc2crops:soybean");
		pamhc2crops(context, "rhubarb", "minecraft:sugar_cane", "pamhc2crops:lettuce");
		pamhc2crops(context, "rice", "pamhc2crops:rye", "minecraft:sugar_cane");
		pamhc2crops(context, "rutabaga", "minecraft:beetroot", "pamhc2crops:turnip");
		pamhc2crops(context, "rye", "pamhc2crops:barley", "minecraft:wheat");
		pamhc2crops(context, "scallion", "minecraft:carrot", "minecraft:sugar_cane");
		pamhc2crops(context, "sesameseeds", "pamhc2crops:rice", "pamhc2crops:coffeebean");
		pamhc2crops(context, "sisal", "pamhc2crops:agave", "minecraft:cactus");
		pamhc2crops(context, "soybean", "pamhc2crops:bean", "pamhc2crops:rice");
		pamhc2crops(context, "spiceleaf", "pamhc2crops:tealeaf", "pamhc2crops:chilipepper");
		pamhc2crops(context, "spinach", "pamhc2crops:lettuce", "minecraft:cactus");
		pamhc2crops(context, "strawberry", "pamhc2crops:radish", "pamhc2crops:soybean");
		pamhc2crops(context, "sweetpotato", "minecraft:potato", "minecraft:sugar_cane");
		pamhc2crops(context, "taro", "minecraft:potato", "pamhc2crops:ginger");
		pamhc2crops(context, "tealeaf", "minecraft:seagrass", "pamhc2crops:soybean");
		pamhc2crops(context, "tomatillo", "pamhc2crops:tomato", "pamhc2crops:eggplant");
		pamhc2crops(context, "tomato", "pamhc2crops:sweetpotato", "minecraft:carrot");
		pamhc2crops(context, "turnip", "pamhc2crops:parsnip", "pamhc2crops:radish");
		pamhc2crops(context, "waterchestnut", "pamhc2crops:sesameseeds", "minecraft:seagrass");
		pamhc2crops(context, "whitemushroom", "minecraft:red_mushroom", "minecraft:brown_mushroom");
		pamhc2crops(context, "wintersquash", "minecraft:pumpkin", "pamhc2crops:zucchini");
		pamhc2crops(context, "zucchini", "minecraft:pumpkin", "pamhc2crops:cucumber");
		pamhc2crops(context, "alfalfa", "pamhc2crops:sesameseeds", "pamhc2crops:spinach");
		pamhc2crops(context, "aloe", "minecraft:cactus", "pamhc2crops:agave");
		pamhc2crops(context, "barrelcactus", "minecraft:cactus", "pamhc2crops:cactusfruit");
		pamhc2crops(context, "canola", "minecraft:wheat", "pamhc2crops:millet");
		pamhc2crops(context, "cattail", "minecraft:seagrass", "minecraft:wheat");
		pamhc2crops(context, "chia", "pamhc2crops:millet", "pamhc2crops:canola");
		pamhc2crops(context, "cloudberry", "minecraft:sweet_berries", "pamhc2crops:mulberry");
		pamhc2crops(context, "lotus", "minecraft:seagrass", "minecraft:pink_tulip");
		pamhc2crops(context, "nettles", "pamhc2crops:tealeaf", "pamhc2crops:spinach");
		pamhc2crops(context, "nopales", "pamhc2crops:barrelcactus", "pamhc2crops:cactusfruit");
		pamhc2crops(context, "sorghum", "pamhc2crops:canola", "pamhc2crops:rye");
		pamhc2crops(context, "truffle", "minecraft:brown_mushroom", "pamhc2crops:whitemushroom");
		pamhc2crops(context, "wolfberry", "pamhc2crops:cloudberry", "pamhc2crops:strawberry");
		pamhc2crops(context, "yucca", "pamhc2crops:aloe", "pamhc2crops:agave");
		pamhc2crops(context, "bokchoy", "pamhc2crops:kale", "pamhc2crops:leek");
		pamhc2crops(context, "calabash", "minecraft:pumpkin", "pamhc2crops:wintersquash");
		pamhc2crops(context, "guarana", "pamhc2crops:cloudberry", "pamhc2crops:tomatillo");
		pamhc2crops(context, "papyrus", "pamhc2crops:cattail", "minecraft:sugar_cane");
		pamhc2crops(context, "sunchoke", "pamhc2crops:artichoke", "pamhc2crops:parsnip");
	}

	private static void r(BootstrapContext<AgriMutation> context, String modid, String mutationId, AgriMutation mutation) {
		context.register(ResourceKey.create(AgriMutation.REGISTRY_KEY, ResourceLocation.fromNamespaceAndPath(modid, mutationId)), mutation);
	}

	private static void mc(BootstrapContext<AgriMutation> context, String mutationId, AgriMutation mutation) {
		r(context, "minecraft", mutationId, mutation);
	}

	private static void agricraft(BootstrapContext<AgriMutation> context, String mutationId, AgriMutation mutation) {
		r(context, "agricraft", mutationId, mutation);
	}

	private static void croptopia(BootstrapContext<AgriMutation> context, String name, String parent1, String parent2) {
		r(context, "croptopia", name, new AgriMutation("croptopia:" + name, parent1, parent2, 0.5));
	}

	private static void pamhc2crops(BootstrapContext<AgriMutation> context, String name, String parent1, String parent2) {
		r(context, "pamhc2crops", name, new AgriMutation("pamhc2crops:" + name, parent1, parent2, 0.5));
	}

}
