package com.rgbcraft.baumod.main.handlers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.rgbcraft.baumod.main.blocks.Blocks;
import com.rgbcraft.baumod.main.items.Items;

public class CraftingHandler {
	public static void AggiungiCrafting() {

		//
		// RECIPE CRAFTING
		//

	
		GameRegistry.addRecipe(new ItemStack(Blocks.litplaster, 1),
				new Object[] { "WLW", "LPL", "WLW", 'L', Item.lightStoneDust, 'W', Item.bucketWater, 'P', Blocks.plaster});
		
		// Antenne
		GameRegistry.addRecipe(new ItemStack(Blocks.ParabolaSat, 1),
				new Object[] { "II ", "II ", "  R", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.AntennaGroundPlane, 1),
				new Object[] { " I ", " R ", "I I", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.AntennaLogperiodica, 1),
				new Object[] { "II ", "RII", "II ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.AntennaYagiVHF, 1),
				new Object[] { "I I", "III", "IRI", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.AntennaYagiUHF, 1),
				new Object[] { "I  ", "RII", "I  ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.AntennaSettore900MHz, 1),
				new Object[] { " I ", "RRR", " I ", 'I', Item.ingotIron, 'R', Item.redstone });
		GameRegistry.addRecipe(new ItemStack(Blocks.Traliccio, 4),
				new Object[] { "I I", "III", "I I", 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoSat, 1),
				new Object[] { "   ", " TI", "   ", 'I', Item.ingotIron, 'T', Blocks.Traliccio});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoSingolo, 1),
				new Object[] { "   ", "TII", "   ", 'I', Item.ingotIron, 'T', Blocks.Traliccio});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoSingolo, 1),
				new Object[] { "   ", "ITI", "   ", 'I', Item.ingotIron, 'T', Blocks.Traliccio});
		GameRegistry.addRecipe(new ItemStack(Blocks.Scrivania, 1), new Object [] { "SSS", "I I", "I I", 'I',
				Item.ingotIron, 'S', Block.stoneSingleSlab});
		
		// Lampade
		GameRegistry.addRecipe(new ItemStack(Blocks.NeonPiatto, 1), new Object[] { "IGI", "GLG", "IGI", 'I', Item.ingotIron,
				'G', Block.thinGlass, 'L', Item.lightStoneDust });
		GameRegistry.addRecipe(new ItemStack(Blocks.Lampadario, 1), new Object[] { " I ", "III", " L ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust });
		GameRegistry.addRecipe(new ItemStack(Blocks.LampadaScrivania, 1), new Object[] { "III", "I L", "I  ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.LampioneMuro, 1), new Object[] { "III", "  L", "   ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.LampioneGiardino, 1), new Object[] { " R ", " L ", " I ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust, 'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.LampionePaloModerno, 1), new Object[] { "   ", "IIL", "   ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.LampionePaloVecchio, 1), new Object[] { "   ", "III", "  L", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.Faro, 1), new Object[] { "ILI", "ILI", " I ", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.Neon, 1), new Object[] { "ILI", "I I", "III", 'I', Item.ingotIron, 'L', Item.lightStoneDust });
		

		//Confuser
		GameRegistry.addRecipe(new ItemStack(Blocks.AtariST, 1), new Object[] { "IRI", "ILI", "IGI", 'I', Item.ingotIron,
				'R', Item.redstone, 'L', Item.lightStoneDust, 'G', Block.thinGlass });
		GameRegistry.addRecipe(new ItemStack(Blocks.Portatile, 1), new Object[] { "ILI", "IGI", "IRI", 'I', Item.ingotIron,
				'R', Item.redstone, 'L', Item.lightStoneDust, 'G', Block.thinGlass });
		GameRegistry.addRecipe(new ItemStack(Blocks.ModemSat, 1), new Object[] { "   ", "III", "IRI", 'I', Item.ingotIron, 'R', Item.redstone});
		
		//Studio TV
		GameRegistry.addRecipe(new ItemStack(Blocks.Microfono, 1), new Object[] { "IRI", "I I", " I ", 'I', Item.ingotIron,
				'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.Telecamera, 1), new Object[] { "  I", "RII", " II", 'I', Item.ingotIron,
				'R', Item.redstone});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.TVLCD, 1), new Object [] { "GGG", "GLG", "IRI", 'I',
				Item.ingotIron, 'G', Block.thinGlass, 'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.TVOLED, 1), new Object [] { "GGG", "LLL", "IRI", 'I',
				Item.ingotIron, 'G', Block.thinGlass, 'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.TVOLEDVESA, 1), new Object [] { "GGG", "LIL", "IRI", 'I',
				Item.ingotIron, 'G', Block.thinGlass, 'L', Item.lightStoneDust});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.CCTVCam, 1), new Object [] { "GR ", " I ", " II", 'I',
				Item.ingotIron, 'G', Block.thinGlass, 'R', Item.redstone});
		GameRegistry.addRecipe(new ItemStack(Blocks.CCTVCamPTZ, 1), new Object [] { " II", " I ", " GR", 'I',
				Item.ingotIron, 'G', Block.thinGlass, 'R', Item.redstone});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.grassPath, 1), new Object[] { Block.dirt });
		GameRegistry.addShapelessRecipe(new ItemStack(Item.wheat, 9), new Object[] { Blocks.hay });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.hay, 1), new Object[] { Item.wheat, Item.wheat, Item.wheat,
				Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat, Item.wheat });
		GameRegistry.addSmelting(296, new ItemStack(Items.straw, 1), 0.15f);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.mortar, 16),
				new Object[] { Item.clay, Item.clay, Item.clay, Item.clay, Item.bucketWater });
		GameRegistry.addRecipe(new ItemStack(Blocks.timberframecrossbrace, 16),
				new Object[] { "LCL", "CLC", "LCL", 'L', Block.wood, 'C', Item.clay });
		GameRegistry.addRecipe(new ItemStack(Blocks.timberframe, 16),
				new Object[] { "LCL", "LCL", "LCL", 'L', Block.wood, 'C', Item.clay });
		GameRegistry.addRecipe(new ItemStack(Blocks.thatch, 16), new Object[] { "   ", "SS ", "SS ", 'S', Items.straw });
		GameRegistry.addRecipe(new ItemStack(Blocks.plaster, 16), new Object[] { "   ", " T ", "MCW", 'T', Items.straw, 'M',
				new ItemStack(Item.dyePowder, 1, 15), 'C', Item.clay, 'W', Item.bucketWater });
		GameRegistry.addRecipe(new ItemStack(Blocks.hazardstripe, 16), new Object[] { "YBY", "BMB", "YBY", 'Y',
				new ItemStack(Item.dyePowder, 1, 11), 'B', new ItemStack(Item.dyePowder, 1, 0), 'M', Blocks.mortar });

		GameRegistry.addRecipe(new ItemStack(Blocks.Estintore, 1), new Object [] { " I ", "IBI", "IBI", 'I',
				Item.ingotIron, 'B', Item.bucketWater});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Polycom, 1), new Object [] { " I ", " N ", " I ", 'I',
				Item.ingotIron, 'N', new ItemStack(Item.dyePowder, 1, 0)});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.ClimaUE, 1), new Object [] { "IBI", "IBI", "IBI", 'I',
				Item.ingotIron, 'B', Item.bucketWater});
		GameRegistry.addRecipe(new ItemStack(Blocks.Clima, 1), new Object [] { "III", "IBI", "   ", 'I',
				Item.ingotIron, 'B', Item.bucketWater});
		
		//ARGILLA DA BLOCCO
		GameRegistry.addShapelessRecipe(new ItemStack(Item.clay, 4), new Object[]{new ItemStack(Block.blockClay)});
		
		// Plaster colorati
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.black_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.red_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.green_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brown_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blue_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.purple_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cyan_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_gray_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gray_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pink_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lime_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.yellow_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_blue_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.magenta_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.orange_plaster, 1),
				new Object[] { Blocks.plaster, new ItemStack(Item.dyePowder, 1, 14) });

		// Terracotta

		// Prima fase cuoci l'argilla
		GameRegistry.addSmelting(82, new ItemStack(Blocks.terracotta), 0.15f);

		// Poi colora l'argilla
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.red_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.green_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brown_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blue_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.purple_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cyan_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_gray_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gray_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pink_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lime_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.yellow_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_blue_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.magenta_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.orange_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 14) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.white_terracotta, 1),
				new Object[] { Blocks.terracotta, new ItemStack(Item.dyePowder, 1, 15) });

		// Metro
		
		GameRegistry.addRecipe(new ItemStack(Items.metro, 1), new Object[] { "   ", "YII", "   ", 'Y',
				new ItemStack(Item.dyePowder, 1, 11), 'I', Item.ingotIron});
		
		// Tintet glss

		// Prima cosa fondi il vetro
		GameRegistry.addSmelting(20, new ItemStack(Items.molten_glass), 0.15f);

		// Poi colora il vetro
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.black_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.red_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.green_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.brown_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blue_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.purple_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cyan_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_gray_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 7) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gray_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pink_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.lime_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.yellow_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.light_blue_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.magenta_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.orange_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 14) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.white_tintedGlass, 1),
				new Object[] { Items.molten_glass, new ItemStack(Item.dyePowder, 1, 15) });

	}
}
