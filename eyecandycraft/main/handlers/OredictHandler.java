package eyecandycraft.main.handlers;

import net.minecraftforge.oredict.OreDictionary;

public class OredictHandler {
    public static void RegistraOreDict() {
        OreDictionary.registerOre("blackPainter", ic2.api.Items.getItem("blackPainter"));
        OreDictionary.registerOre("redPainter", ic2.api.Items.getItem("redPainter"));
        OreDictionary.registerOre("greenPainter", ic2.api.Items.getItem("greenPainter"));
        OreDictionary.registerOre("brownPainter", ic2.api.Items.getItem("brownPainter"));
        OreDictionary.registerOre("bluePainter", ic2.api.Items.getItem("bluePainter"));
        OreDictionary.registerOre("purplePainter", ic2.api.Items.getItem("purplePainter"));
        OreDictionary.registerOre("cyanPainter", ic2.api.Items.getItem("cyanPainter"));
        OreDictionary.registerOre("lightGreyPainter", ic2.api.Items.getItem("lightGreyPainter"));
        OreDictionary.registerOre("darkGreyPainter", ic2.api.Items.getItem("darkGreyPainter"));
        OreDictionary.registerOre("pinkPainter", ic2.api.Items.getItem("pinkPainter"));
        OreDictionary.registerOre("limePainter", ic2.api.Items.getItem("limePainter"));
        OreDictionary.registerOre("yellowPainter", ic2.api.Items.getItem("yellowPainter"));
        OreDictionary.registerOre("cloudPainter", ic2.api.Items.getItem("cloudPainter"));
        OreDictionary.registerOre("magentaPainter", ic2.api.Items.getItem("magentaPainter"));
        OreDictionary.registerOre("orangePainter", ic2.api.Items.getItem("orangePainter"));
        OreDictionary.registerOre("whitePainter", ic2.api.Items.getItem("whitePainter"));
    }
}