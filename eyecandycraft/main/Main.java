package eyecandycraft.main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;

import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import eyecandycraft.main.blocks.*;
import eyecandycraft.main.handlers.CraftingHandler;
import eyecandycraft.main.handlers.FacadeHandler;
import eyecandycraft.main.items.Items;
import eyecandycraft.main.proxies.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.src.BaseMod;
import net.minecraftforge.common.MinecraftForge;



@Mod(name="Eyecandycraft", version="2.7", modid="eyecandycraft")
public class Main extends BaseMod{
	
	@Override
	public String getVersion() {
		return "2.7";
	}
	
	@SidedProxy(clientSide="eyecandycraft.main.proxies.ClientProxy", serverSide="eyecandycraft.main.proxies.ServerProxy")
	public static CommonProxy proxy;
	

	@Override
	public void load() {

	}
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("VIVA LA DMU MANLEY-MOREL");	

	}
	
	
	@Init
	public void init(FMLInitializationEvent event) {
		//proxy per modelli techne
		proxy.init(event);
		Blocks.InizializzaBlocchi();
		Blocks.RegistraBlocchi();
		Blocks.RegistraLingua();
		Blocks.AggiungiAttributi();
		Items.InizializzaItem();
		Items.RegistraLingua();
		FacadeHandler.RegistraFacade();
		Blocks.InitPorte();
	}
	
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		//proxy per modelli techne
		CraftingHandler.AggiungiCrafting();
	    proxy.postInit(event);
	}
	
	
	
	
}
