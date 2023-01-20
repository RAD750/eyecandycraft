package eyecandycraft.main.handlers;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import eyecandycraft.main.blocks.Blocks;
import eyecandycraft.main.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSign;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CraftingHandler {
	public static void AggiungiCrafting() {

		//
		// RECIPE CRAFTING
		//
		
		//ez recipe
	
		GameRegistry.addShapelessRecipe(new ItemStack(Item.stick, 24), new Object[] {new ItemStack(Block.wood), new ItemStack(Block.wood), new ItemStack(Block.wood)});
		GameRegistry.addShapedRecipe(new ItemStack(Block.chest, 4), new Object[] {"###", "# #", "###", '#', new ItemStack(Block.wood)});
		//Cartelli
		
				GameRegistry.addRecipe(new ItemStack(Items.Sign_acacia, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', new ItemStack(Item.dyePowder, 1, 14)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_crimson, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', new ItemStack(Item.dyePowder, 1, 13)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_dark_oak, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', new ItemStack(Item.dyePowder, 1, 3)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_frame, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', Blocks.plaster});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_jungle, 3),
						new Object [] { "###", "#|#", " | ", '|', Item.stick, '#', new ItemStack(Block.planks, 1, 3)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_metal, 3),
						new Object [] { "###", "###", " | ", '|', ic2.api.Items.getItem("ironFence"), '#', Item.ingotIron,});
				GameRegistry.addShapelessRecipe(new ItemStack(Items.Sign_oak, 1), new Object[] {Item.sign});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_spruce, 3),
						new Object [] { "###", "#|#", " | ", '|', Item.stick, '#', new ItemStack(Block.planks, 1, 1)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_warped, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', new ItemStack(Item.dyePowder, 1, 6)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_white, 3),
						new Object [] { "###", "#M#", " | ", '|', Item.stick, '#', Block.planks, 'M', new ItemStack(Item.dyePowder, 1, 15)});
				GameRegistry.addRecipe(new ItemStack(Items.Sign_birch, 3),
						new Object [] { "###", "#|#", " | ", '|', Item.stick, '#', new ItemStack(Block.planks, 1, 2)});
		// mattonelle
		
				
		
				GameRegistry.addRecipe(new ItemStack(Items.gray_tile_raw, 9),
					new Object[] { "###", "###", "###", '#', Item.clay});

				GameRegistry.addRecipe(new ItemStack(Items.gray_diag_tile_raw, 5),
					new Object[] { " # ", "###", " # ", '#', Item.clay});
				
				GameRegistry.addRecipe(new ItemStack(Items.gray_small_tile_raw, 5),
					new Object[] { "# #", " # ", "# #", '#', Item.clay});
				
				GameRegistry.addRecipe(new ItemStack(Block.snow, 6), new Object[] { "   ", "###", "   ", '#', new ItemStack(Block.blockSnow)});
				
				GameRegistry.addRecipe(new ItemStack(Blocks.Sirena, 1), new Object[] { "  I", "NII", "  I", 'N', Block.music, 'I', Item.ingotIron});
				
				GameRegistry.addRecipe(new ItemStack(Items.o_LGBT), new Object[] { "AAB", "CDD", "EFF", 'A', new ItemStack(Block.cloth, 1, 14), 'B', new ItemStack(Block.cloth, 1, 2), 'C', new ItemStack(Block.cloth, 1, 4), 'D', new ItemStack(Block.cloth, 1, 5), 'E', new ItemStack(Block.cloth, 1, 11), 'F', new ItemStack(Block.cloth, 1, 10)});
				
				GameRegistry.addShapelessRecipe(new ItemStack(Items.white_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 15) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_gray_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 7) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.black_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 0) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.brown_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 3) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.red_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 1) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.orange_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 14) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.yellow_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 11) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.lime_tile_raw, 1),
					new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 10) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.green_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 2) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_blue_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 12) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.cyan_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 6) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.blue_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 4) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.purple_tile_raw, 1),
					new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 5) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.magenta_tile_raw, 1),
				    new Object[] { Items.gray_tile_raw, new ItemStack(Item.dyePowder, 1, 13) });
				
				GameRegistry.addShapelessRecipe(new ItemStack(Items.white_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 15) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_gray_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 7) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.black_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 0) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.brown_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 3) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.red_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 1) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.orange_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 14) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.yellow_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 11) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.lime_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 10) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.green_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 2) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_blue_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 12) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.cyan_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 6) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.blue_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 4) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.purple_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 5) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.magenta_diag_tile_raw, 1),
				    new Object[] { Items.gray_diag_tile_raw, new ItemStack(Item.dyePowder, 1, 13) });
				
				GameRegistry.addShapelessRecipe(new ItemStack(Items.white_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 15) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_gray_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 7) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.gray_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 8) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.black_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 0) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.brown_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 3) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.red_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 1) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.orange_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 14) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.yellow_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 11) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.lime_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 10) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.green_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 2) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.light_blue_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 12) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.cyan_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 6) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.blue_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 4) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.purple_small_tile_raw, 1),
				    new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 5) });
				GameRegistry.addShapelessRecipe(new ItemStack(Items.magenta_small_tile_raw, 1),
					new Object[] { Items.gray_small_tile_raw, new ItemStack(Item.dyePowder, 1, 13) });
				
				//cuoci tutte le mattonelle
				
				GameRegistry.addSmelting(Items.white_small_tile_raw.itemID, new ItemStack(Blocks.white_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_gray_small_tile_raw.itemID, new ItemStack(Blocks.light_gray_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.gray_small_tile_raw.itemID, new ItemStack(Blocks.gray_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.black_small_tile_raw.itemID, new ItemStack(Blocks.black_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.brown_small_tile_raw.itemID, new ItemStack(Blocks.brown_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.red_small_tile_raw.itemID, new ItemStack(Blocks.red_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.orange_small_tile_raw.itemID, new ItemStack(Blocks.orange_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.yellow_small_tile_raw.itemID, new ItemStack(Blocks.yellow_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.lime_small_tile_raw.itemID, new ItemStack(Blocks.lime_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.green_small_tile_raw.itemID, new ItemStack(Blocks.green_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_blue_small_tile_raw.itemID, new ItemStack(Blocks.light_blue_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.cyan_small_tile_raw.itemID, new ItemStack(Blocks.cyan_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.blue_small_tile_raw.itemID, new ItemStack(Blocks.blue_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.purple_small_tile_raw.itemID, new ItemStack(Blocks.purple_small_tile), 0.15f);
				GameRegistry.addSmelting(Items.magenta_small_tile_raw.itemID, new ItemStack(Blocks.magenta_small_tile), 0.15f);
				
				GameRegistry.addSmelting(Items.white_diag_tile_raw.itemID, new ItemStack(Blocks.white_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_gray_diag_tile_raw.itemID, new ItemStack(Blocks.light_gray_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.gray_diag_tile_raw.itemID, new ItemStack(Blocks.gray_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.black_diag_tile_raw.itemID, new ItemStack(Blocks.black_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.brown_diag_tile_raw.itemID, new ItemStack(Blocks.brown_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.red_diag_tile_raw.itemID, new ItemStack(Blocks.red_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.orange_diag_tile_raw.itemID, new ItemStack(Blocks.orange_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.yellow_diag_tile_raw.itemID, new ItemStack(Blocks.yellow_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.lime_diag_tile_raw.itemID, new ItemStack(Blocks.lime_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.green_diag_tile_raw.itemID, new ItemStack(Blocks.green_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_blue_diag_tile_raw.itemID, new ItemStack(Blocks.light_blue_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.cyan_diag_tile_raw.itemID, new ItemStack(Blocks.cyan_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.blue_diag_tile_raw.itemID, new ItemStack(Blocks.blue_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.purple_diag_tile_raw.itemID, new ItemStack(Blocks.purple_diag_tile), 0.15f);
				GameRegistry.addSmelting(Items.magenta_diag_tile_raw.itemID, new ItemStack(Blocks.magenta_diag_tile), 0.15f);
				
				GameRegistry.addSmelting(Items.white_tile_raw.itemID, new ItemStack(Blocks.white_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_gray_tile_raw.itemID, new ItemStack(Blocks.light_gray_tile), 0.15f);
				GameRegistry.addSmelting(Items.gray_tile_raw.itemID, new ItemStack(Blocks.gray_tile), 0.15f);
				GameRegistry.addSmelting(Items.black_tile_raw.itemID, new ItemStack(Blocks.black_tile), 0.15f);
				GameRegistry.addSmelting(Items.brown_tile_raw.itemID, new ItemStack(Blocks.brown_tile), 0.15f);
				GameRegistry.addSmelting(Items.red_tile_raw.itemID, new ItemStack(Blocks.red_tile), 0.15f);
				GameRegistry.addSmelting(Items.orange_tile_raw.itemID, new ItemStack(Blocks.orange_tile), 0.15f);
				GameRegistry.addSmelting(Items.yellow_tile_raw.itemID, new ItemStack(Blocks.yellow_tile), 0.15f);
				GameRegistry.addSmelting(Items.lime_tile_raw.itemID, new ItemStack(Blocks.lime_tile), 0.15f);
				GameRegistry.addSmelting(Items.green_tile_raw.itemID, new ItemStack(Blocks.green_tile), 0.15f);
				GameRegistry.addSmelting(Items.light_blue_tile_raw.itemID, new ItemStack(Blocks.light_blue_tile), 0.15f);
				GameRegistry.addSmelting(Items.cyan_tile_raw.itemID, new ItemStack(Blocks.cyan_tile), 0.15f);
				GameRegistry.addSmelting(Items.blue_tile_raw.itemID, new ItemStack(Blocks.blue_tile), 0.15f);
				GameRegistry.addSmelting(Items.purple_tile_raw.itemID, new ItemStack(Blocks.purple_tile), 0.15f);
				GameRegistry.addSmelting(Items.magenta_tile_raw.itemID, new ItemStack(Blocks.magenta_tile), 0.15f);
		
	
		GameRegistry.addRecipe(new ItemStack(Blocks.litplaster, 1),
				new Object[] { "WLW", "LPL", "WLW", 'L', Item.lightStoneDust, 'W', Item.bucketWater, 'P', Blocks.plaster});
		GameRegistry.addRecipe(new ItemStack(Blocks.permaDirt, 8),
				new Object[] { "DDD", "DWD", "DDD", 'D', Block.dirt,  'W', Item.redstone});
		
		//cancelletti
		GameRegistry.addRecipe(new ItemStack(Blocks.spruceGate),
				new Object[] {"S S", "SWS", "SWS", 'W', new ItemStack(Block.planks, 1, 1),  'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.birchGate),
				new Object[] {"S S", "SWS", "SWS", 'W', new ItemStack(Block.planks, 1, 2),  'S', Item.stick});
		GameRegistry.addRecipe(new ItemStack(Blocks.jungleGate),
				new Object[] {"S S", "SWS", "SWS", 'W', new ItemStack(Block.planks, 1, 3),  'S', Item.stick});
		
		//tronchi scortecciati
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.strippedOakLog, 2), new Object[] {new ItemStack(Block.wood, 1, 0), new ItemStack(Block.wood, 1, 0), });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.strippedSpruceLog, 2), new Object[] {new ItemStack(Block.wood, 1, 1), new ItemStack(Block.wood, 1, 1), });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.strippedBirchLog, 2), new Object[] {new ItemStack(Block.wood, 1, 2), new ItemStack(Block.wood, 1, 2), });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.strippedJungleLog, 2), new Object[] {new ItemStack(Block.wood, 1, 3), new ItemStack(Block.wood, 1, 3), });
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.oakLog), new Object[] { "WW ", "WW ", 'W', new ItemStack(Block.wood, 1, 0) });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.spruceLog), new Object[] { "WW ", "WW ", 'W', new ItemStack(Block.wood, 1, 1) });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.birchLog), new Object[] { "WW ", "WW ", 'W', new ItemStack(Block.wood, 1, 2) });
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.jungleLog), new Object[] { "WW ", "WW ", 'W', new ItemStack(Block.wood, 1, 3) });
		
		
		
		// Antenne
		
		List <ItemStack> duraluminOres = OreDictionary.getOres("ingotDuralumin");
		if ( duraluminOres.size() > 0 ) {
			ItemStack duralumin = duraluminOres.get(0);
			ItemStack amplifier = ic2.api.Items.getItem("electronicCircuit");
			ItemStack lna = ic2.api.Items.getItem("advancedCircuit");
			GameRegistry.addRecipe(new ItemStack(Blocks.ParabolaSat, 1),
					new Object[] { "II ", "II ", "  R", 'I', duralumin, 'R', lna });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaGroundPlane, 1),
					new Object[] { " I ", " R ", "I I", 'I', duralumin, 'R', lna });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaLogperiodica, 1),
					new Object[] { "II ", "RII", "II ", 'I', duralumin, 'R', amplifier });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaVDipole, 1),
					new Object[] { "I I", " R ", " I ", 'I', duralumin, 'R', amplifier });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaYagiVHF, 1),
					new Object[] { "I I", "III", "IRI", 'I', duralumin, 'R', amplifier });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaYagiUHF, 1),
					new Object[] { "I  ", "RII", "I  ", 'I', duralumin, 'R', amplifier });
			GameRegistry.addRecipe(new ItemStack(Blocks.AntennaSettore900MHz, 1),
					new Object[] { " I ", "RRR", " I ", 'I', duralumin, 'R', amplifier });
			
			GameRegistry.addRecipe(new ItemStack(Blocks.fakeVent, 4),
					new Object[] { "III", "IVI", "III", 'I', duralumin, 'V', new ItemStack(Block.fenceIron)});
			
			GameRegistry.addRecipe(new ItemStack(Blocks.Persiane, 1),
					new Object[] {"###", "#C#", "###", '#', duralumin, 'C', new ItemStack(Item.dyePowder, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Blocks.PersianeMezza, 1),
					new Object[] {"## ", "#C ", "## ", '#', duralumin, 'C', new ItemStack(Item.dyePowder, 1, 2)});
			GameRegistry.addRecipe(new ItemStack(Blocks.Doccia, 1),
					new Object[] {"## ", " # ", "#B#", '#', duralumin, 'B', new ItemStack(Item.bucketEmpty, 1)});
			GameRegistry.addRecipe(new ItemStack(Blocks.DocciaMiscelatore, 1),
					new Object[] {" # ", "C#F", "   ", '#', duralumin, 'C', new ItemStack(Item.dyePowder, 1, 1), 'F', new ItemStack(Item.dyePowder, 1, 4)});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare duralumin, disabilitate ricette antenne e persiane!!!!");
		}
		

		
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Traliccio, 4),
				new Object[] { "I I", "III", "I I", 'I', Item.ingotIron});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoSat, 1),
				new Object[] { "   ", " TI", "   ", 'I', Item.ingotIron, 'T', Blocks.Traliccio});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoSingolo, 1),
				new Object[] { "   ", "TII", "   ", 'I', Item.ingotIron, 'T', Blocks.Traliccio});
		GameRegistry.addRecipe(new ItemStack(Blocks.TraliccioBraccettoCCTV, 1),
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
		GameRegistry.addRecipe(new ItemStack(Blocks.FaroPavimento, 1), new Object[] { "ILI", "ILI", "I I", 'I', Item.ingotIron,
				'L', Item.lightStoneDust});
		GameRegistry.addRecipe(new ItemStack(Blocks.Neon, 1), new Object[] { "ILI", "I I", "III", 'I', Item.ingotIron, 'L', Item.lightStoneDust });
		GameRegistry.addRecipe(new ItemStack(Blocks.CroceSAndrea, 1), new Object[] { "RIR", " R ", "RIR", 'R',
				new ItemStack(Item.dyePowder, 1, 1), 'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Blocks.OB, 1), new Object[] { "YY ", "IY ", "YY ", 'Y',
				new ItemStack(Item.dyePowder, 1, 11), 'I', Item.ingotIron });

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
		GameRegistry.addRecipe(new ItemStack(Blocks.metaBlockAlpha, 16, 0), new Object[] { "   ", "SS ", "SS ", 'S', Items.straw });
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
		
		
		
		
		List <ItemStack> inoxOres = OreDictionary.getOres("ingotRefinedIron");
		if ( inoxOres.size() > 0 ) {
			ItemStack inox = inoxOres.get(0);
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.corrugatedSteel, 16, 1), new Object [] {"I I", " I ", "I I", 'I', inox});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare refinedIron, disabilitata recipe secondaria CorrugatedSteel");
		}
		
		//mattoni
		
		ItemStack brick = new ItemStack(Item.brick, 1);
		ItemStack whiteDye = new ItemStack(Item.dyePowder, 1, 15);
		ItemStack grayDye = new ItemStack(Item.dyePowder, 1, 8);
		ItemStack brownDye = new ItemStack(Item.dyePowder, 1, 3);
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 2, 1), new Object[] {
				"   ", "BW ", "WB ", 'B', brick, 'W', whiteDye
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 2, 2), new Object[] {
				"   ", "BG ", "GB ", 'B', brick, 'G', grayDye
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 5, 3), new Object[] {
				"BWB", "WBW", "BWB", 'B', brick, 'W', whiteDye
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 5, 4), new Object[] {
				"BGB", "GBG", "BGB", 'B', brick, 'G', grayDye
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 2, 5), new Object[] {
				"   ", "BD ", "DB ", 'B', brick, 'D', brownDye
		});
		
		List <ItemStack> granite = OreDictionary.getOres("rockGranito");
		if ( granite.size() > 0 ) {
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 4, 6), new Object[] {
					"   ", "## ", "## ", '#', granite.get(0)
			});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare Granito, disabilitata recipe mattoni granito");
		}
		
		GameRegistry.addSmelting(Block.brick.blockID, new ItemStack(Blocks.metaBlockAlpha, 1, 7),0);
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.metaBlockAlpha, 1, 8), new Object [] {
				new ItemStack(Block.brick, 1), grayDye
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.metaBlockAlpha, 1, 9), new Object [] {
				new ItemStack(Block.brick, 1), whiteDye
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 4, 10), new Object[] {
				"   ", "## ", "## ", '#', new ItemStack(Blocks.mortar)
		});
		
		List <ItemStack> gneiss = OreDictionary.getOres("rockGneiss");
		if ( gneiss.size() > 0 ) {
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 4, 11), new Object[] {
					"   ", "## ", "## ", '#', gneiss.get(0)
			});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare Gneiss, disabilitata recipe mattoni gneiss");
		}
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.metaBlockAlpha, 8, 12), new Object[] {
				"###", "#W#", "###", '#', new ItemStack(Blocks.metaBlockAlpha, 1, 9), 'W', new ItemStack(Item.bucketWater)
		});
		
		List <ItemStack> chrysotile = OreDictionary.getOres("gemChrysotile");
		if ( chrysotile.size() > 0 ) {
			GregtechHandler.addBlastRecipe(
					new ItemStack(Blocks.metaBlockAlpha, 1, 10),
					chrysotile.get(0),
					new ItemStack(Blocks.metaBlockAlpha, 1, 13),
					GregtechHandler.getGregTechItem(1, 1, 62),
					600,
					350,
					1800
					);
			GregtechHandler.addBlastRecipe(
					new ItemStack(Item.clay, 4),
					chrysotile.get(0),
					new ItemStack(Blocks.metaBlockAlpha, 1, 15),
					GregtechHandler.getGregTechItem(1, 1, 62),
					100,
					1870,
					1200
					);
			GameRegistry.addRecipe(new ItemStack(Items.doorFireProof, 1), new Object[] {
					"AAA", "LDL", "AAA", 'A', chrysotile.get(0), 'L', new ItemStack(Block.lever), 'D',ic2.api.Items.getItem("reinforcedDoor")
				});

		} else {
			System.err.println("[Eyecandycraft] Non trovo il crisotilo, niente mesotelioma per te! (E nemmeno glazed bricks e asbestos-cement bricks)");
			GameRegistry.addShapelessRecipe(new ItemStack(Items.doorFireProof, 1), new Object[] {ic2.api.Items.getItem("reinforcedDoor"), new ItemStack(Block.lever)});
		}
		
		GregtechHandler.addBlastRecipe(
				new ItemStack(Block.sand, 1),
				new ItemStack(Item.clay, 1),
				new ItemStack(Blocks.metaBlockAlpha, 1, 14),
				GregtechHandler.getGregTechItem(1, 1, 62),
				1600,
				150,
				1100
				);
		
		

		
		List <ItemStack> steelOres = OreDictionary.getOres("ingotSteel");
		if ( steelOres.size() > 0 ) {
			ItemStack steel = steelOres.get(0);
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.corrugatedSteel, 32, 1), new Object [] {"I I", " I ", "I I", 'I', steel});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.Transenna, 16), new Object [] {"   ", "###", "###", '#', steel });
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.ScalettaMuro, 3), new Object [] { "# #", "###", "# #", '#', steel});
			GameRegistry.addRecipe(new ItemStack(Blocks.Chain), new Object[] { " N ", " I ", " N ", 'N', steel, 'I', Item.ingotIron});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.Fountain, 2), new Object[] {" # ", "#B#", "#C#", 'C', Item.cauldron, 'B', Item.bucketWater, '#', steel});
			GameRegistry.addRecipe(new ItemStack(Blocks.Cavo, 2), new Object[] { "## ", " # ", " ##", '#', steel});
			GregtechHandler.addWiremillRecipe(new ItemStack(Blocks.Cavo, 1), new ItemStack(Blocks.CavoMedio, 2), 60, 32);
			GregtechHandler.addWiremillRecipe(new ItemStack(Blocks.CavoMedio, 1), new ItemStack(Blocks.CavoPiccolo, 2), 60, 32);
			GregtechHandler.addWiremillRecipe(steel, new ItemStack(Blocks.BarbedWire), 220, 120);
			
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare ingotSteel, disabilitata recipe secondaria CorrugatedSteel/Transenna");
		}
		
		List <ItemStack> tungSteelOres = OreDictionary.getOres("ingotTungstenSteel");
		if ( tungSteelOres.size() > 0 ) {
			ItemStack tungSteel = tungSteelOres.get(0);
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.corrugatedSteel, 64, 1), new Object [] {"I I", " I ", "I I", 'I', tungSteel});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.Transenna, 32), new Object [] {"   ", "###", "###", '#', tungSteel });
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.ScalettaMuro, 6), new Object [] { "# #", "###", "# #", '#', tungSteel});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.Fountain, 2), new Object[] {" # ", "#B#", "#C#", 'C', Item.cauldron, 'B', Item.bucketWater, '#', tungSteel});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare ingotTungstenSteel, disabilitata recipe secondaria CorrugatedSteel/Transenna");
		}
		
		GameRegistry.addRecipe(new ItemStack(Blocks.PaloScaletta, 3), new Object[] { "I# ", " #I", "I# ", 'I', Item.ingotIron, '#', ic2.api.Items.getItem("ironFence")});;
		
		//CorrugatedSteel
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.corrugatedSteel, 8, 1), new Object [] {"I I", " I ", "I I", 'I', Item.ingotIron});
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 3),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 5),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 1) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 9),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 2) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 4),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 3) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 12),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 4) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 13),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 5) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 11),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 6) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 2),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 8) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 15),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 9) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 8),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 10) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 7),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 11) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 10),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 12) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 14),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 13) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 6),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 14) });
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.corrugatedSteel, 1, 0),
				new Object[] { new ItemStack(Blocks.corrugatedSteel, 1, 1), new ItemStack(Item.dyePowder, 1, 15) });
		
		//Panchina
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.PanchinaCentro), new Object [] { "###", "###", "I I", '#', Block.planks, 'I', Item.ingotIron});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.PanchinaDestra), new Object [] { "###", "###", "  I", '#', Block.planks, 'I', Item.ingotIron});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.PanchinaSinistra), new ItemStack(Blocks.PanchinaDestra));
		//Tappeto
		
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 0), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 0)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 1), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 2), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 2)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 3), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 3)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 4), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 4)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 5), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 5)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 6), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 6)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 7), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 7)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 8), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 8)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 9), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 9)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 10), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 10)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 11), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 11)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 12), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 12)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 13), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 13)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 14), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 14)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.tappeto, 3, 15), new Object [] {"   ", "## ", "   ", '#', new ItemStack(Block.cloth, 1, 15)});
		
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
		
		List <ItemStack> nuggetOres = OreDictionary.getOres("nuggetIron");
		if ( nuggetOres.size() > 0 ) {
			ItemStack ironNugget = nuggetOres.get(0);
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.Lanterna), new Object [] {"###", "#T#", "###", '#', ironNugget, 'T', Block.torchWood});
		} else {
			System.err.println("[Eyecandycraft] Impossibile registrare refinedIron, disabilitata recipe secondaria CorrugatedSteel");
		}
		
		
		
		//CARTELLI
		
		//OBBLIGO 1
		GameRegistry.addRecipe(new ItemStack(Items.a_CentraleTermica, 2),
				new Object[] { "WBB", "BIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_LocalePompe, 2),
				new Object[] { "BWB", "BIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_LocaleCaldaie, 2),
				new Object[] { "BBW", "WIW", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_LocaleApplied, 2),
				new Object[] { "BBB", "WIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_LocaleLogistic, 2),
				new Object[] { "BBB", "WIW", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_ProprietaPrivata, 2),
				new Object[] { "BBB", "BIB", "WBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_LocaleSerbatoi, 2),
				new Object[] { "BBB", "BIB", "BWB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_CabinaElettrica, 2),
				new Object[] { "WWW", "BIB", "BBW",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.ab_DPI, 2),
				new Object[] { "WBB", "BIB", "WBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.ab_IndProtettivi, 2),
				new Object[] { "BWB", "BIB", "WBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.ab_RTFM, 2),
				new Object[] { "BBW", "BIB", "WBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.ab_RTFM, 2),
				new Object[] { "WBB", "BIB", "BWB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.ab_ObbligoGenerico, 2),
				new Object[] { "BWB", "BIB", "BWB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.a_IntElettricoGenerale, 2),
				new Object[] { "WBW", "BIB", "BWB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 4),
						'I', Item.ingotIron });
		
		//INCENDIO
		
		GameRegistry.addRecipe(new ItemStack(Items.f_Estintore, 2),
				new Object[] { "WRR", "RIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.f_AllarmeIncendio, 2),
				new Object[] { "RWR", "RIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.f_Sirena, 2),
				new Object[] { "RRW", "RIR", "WRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });

		//EMERGENZA
		
		GameRegistry.addRecipe(new ItemStack(Items.e_Doccia, 2),
				new Object[] { "WLL", "LIL", "LLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.e_ProntoSoccorso, 2),
				new Object[] { "LWL", "LIL", "LLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.e_UscitaEmergenza, 2),
				new Object[] { "WWW", "LIL", "LLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.e_Martelletto, 2),
				new Object[] { "LLL", "WIL", "LLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.e_RompereVetro, 2),
				new Object[] { "LWW", "LIW", "LLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.e_PuntoRitrovo, 2),
				new Object[] { "LLL", "LIL", "WLL",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'L', new ItemStack(Item.dyePowder, 1, 10),
						'I', Item.ingotIron });
		
		//PERICOLO
		
		GameRegistry.addRecipe(new ItemStack(Items.p_PericoloGenerico, 2),
				new Object[] { "WYY", "YIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Esplosivo, 2),
				new Object[] { "YWY", "YIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Laser, 2),
				new Object[] { "YYW", "WIW", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Radioattivo, 2),
				new Object[] { "YYY", "WIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Infiammabile, 2),
				new Object[] { "YWW", "YIW", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Freddo, 2),
				new Object[] { "YYY", "YIY", "WYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Batterie, 2),
				new Object[] { "YYY", "YIY", "YWY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Corrente, 2),
				new Object[] { "YWW", "YIY", "YYW",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Tossico, 2),
				new Object[] { "WWY", "YIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Biohaz, 2),
				new Object[] { "WYW", "YIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Asfissiante, 2),
				new Object[] { "WYY", "WIY", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Toro, 2),
				new Object[] { "WYY", "YIW", "YYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_EX, 2),
				new Object[] { "WYY", "YIY", "WYY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_Corrente2, 2),
				new Object[] { "WYY", "YIY", "YWY",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.p_IAEA, 2),
				new Object[] { "WYY", "YIY", "YYW",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'Y', new ItemStack(Item.dyePowder, 1, 11),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.d_Persona, 2),
				new Object[] { "RRR", "WIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_Fiammifero, 2),
				new Object[] { "RWW", "RIW", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_BereAcqua, 2),
				new Object[] { "RRR", "RIR", "WRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_Spegnere, 2),
				new Object[] { "RRR", "RIR", "RWR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.d_IncendioAcqua, 2),
				new Object[] { "RRR", "RIR", "RRW",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_Ingresso, 2),
				new Object[] { "WWR", "RIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_Parkour, 2),
				new Object[] { "WRW", "RIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.d_Panino, 2),
				new Object[] { "WRR", "WIR", "RRR",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'R', new ItemStack(Item.dyePowder, 1, 1),
						'I', Item.ingotIron });
		
		
		
		GameRegistry.addRecipe(new ItemStack(Items.o_Cestino, 2),
				new Object[] { "WBB", "BIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 12),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.o_Ingranaggio, 2),
				new Object[] { "BWB", "BIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 12),
						'I', Item.ingotIron });
		GameRegistry.addRecipe(new ItemStack(Items.o_RTFM, 2),
				new Object[] { "BWW", "BIB", "BBB",
						'W', new ItemStack(Item.dyePowder, 1, 15),
						'B', new ItemStack(Item.dyePowder, 1, 12),
						'I', Item.ingotIron });
		
		//PORTE
		
		GameRegistry.addRecipe(new ItemStack(Items.jungleDoor, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Block.planks, 1, 3),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.spruceDoor, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Block.planks, 1, 1),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.birchDoor, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Block.planks, 1, 2),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.apartmentDoor, 1),
				new Object[] { "WI ", "WI ", "WI ",
						'W', new ItemStack(Block.planks, 1, 1),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.jungleDoor, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Block.planks, 1, 3),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.jungleDoor2, 1),
				new Object[] { "WI ", "WI ", "WI ",
						'W', new ItemStack(Block.planks, 1, 3),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.glassDoor, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door0, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Item.reed,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door1, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.red_plaster,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door2, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.purple_plaster,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door3, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.cyan_plaster,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door4, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Block.planks, 1, 0),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door5, 1),
				new Object[] { "WW ", "WI ", "WI ",
						'W', new ItemStack(Block.planks, 1, 0),
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door6, 1),
				new Object[] { "WG ", "WI ", "WG ",
						'W', new ItemStack(Block.planks, 1, 3),
						'G', Block.thinGlass,
						'I', Item.ingotIron });

		GameRegistry.addRecipe(new ItemStack(Items.door7, 1),
				new Object[] { "GG ", "WI ", "WG ",
						'W', new ItemStack(Block.planks, 1, 0),
						'G', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door8, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.light_blue_terracotta,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door9, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.red_terracotta,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door10, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.white_terracotta,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door11, 1),
				new Object[] { "WG ", "WI ", "WW ",
						'W', Block.planks,
						'G', Block.thinGlass,
						'I', Item.ingotIron });
	
		GameRegistry.addRecipe(new ItemStack(Items.door12, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', new ItemStack(Blocks.metaBlockAlpha, 1, 0),
						'G', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door13, 1),
				new Object[] { "WW ", "WI ", "WW ",
						'W', Blocks.orange_terracotta,
						'G', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door14, 1),
				new Object[] { "GG ", "WI ", "WW ",
						'W', new ItemStack(Blocks.metaBlockAlpha, 1, 0),
						'G', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addRecipe(new ItemStack(Items.door15, 1),
				new Object[] { "WW ", "GI ", "WW ",
						'W', Blocks.green_terracotta,
						'G', Block.thinGlass,
						'I', Item.ingotIron });
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.door16, 1), new Object[] {new ItemStack(Item.doorSteel), new ItemStack(Block.stoneButton)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.door17, 1), new Object[] {ic2.api.Items.getItem("reinforcedDoor"), new ItemStack(Block.stoneButton)});

		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.doorMetal, 1), new Object[] {new ItemStack(Item.doorSteel), new ItemStack(Block.stoneButton), new ItemStack(Item.ingotIron)});

		
		GameRegistry.addRecipe(new ItemStack(Items.portaCostosa, 1),
				new Object[] { "NNU", "NND", "NNG",
						'N', Item.netherStar,
						'U', ic2.api.Items.getItem("uraniumBlock"),
						'G', Block.blockGold,
						'D', Block.blockDiamond});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Antenna4G, 1),
				new Object[] { "CZC", "ADA", "ASA",
						'C', ic2.api.Items.getItem("electronicCircuit"),
						'D', GregtechHandler.getGregTechItem(3, 1, 1),
						'A', GregtechHandler.getGregTechItem(0, 1, 75),
						'Z', GregtechHandler.getGregTechItem(0, 1, 82),
						'S', GregtechHandler.getGregTechItem(0, 1, 6)
		});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Antenna5G, 1),
				new Object[] { "DZD", "N4N", "BSB",
						'4', new ItemStack(Blocks.Antenna4G, 1),
						'D', GregtechHandler.getGregTechItem(3, 1, 1),
						'N', GregtechHandler.getGregTechItem(3, 1, 2),
						'B', GregtechHandler.getGregTechItem(2, 1, 10),
						'Z', GregtechHandler.getGregTechItem(0, 1, 82),
						'S', GregtechHandler.getGregTechItem(0, 1, 6)
				}
	    );
		
		GameRegistry.addRecipe(new ItemStack(Blocks.Antenna80GHz, 1),
				new Object[] { "DZD", "N4N", "BSB",
						'4', new ItemStack(Blocks.AntennaSettore900MHz, 1),
						'D', GregtechHandler.getGregTechItem(3, 1, 1),
						'N', GregtechHandler.getGregTechItem(3, 1, 2),
						'B', GregtechHandler.getGregTechItem(2, 1, 10),
						'Z', GregtechHandler.getGregTechItem(0, 1, 82),
						'S', GregtechHandler.getGregTechItem(0, 1, 6)
				}
	    );
				
		GameRegistry.addRecipe(new ItemStack(Blocks.fakeCrate),
				new Object[] { "#S#", "SSS", "#S#", 'S', Item.stick, '#', Block.planks});
		
		GregtechHandler.addWiremillRecipe(new ItemStack(Block.fenceIron, 1), new ItemStack(Blocks.wireMesh, 1), 200, 20);
		
		
	}
}
