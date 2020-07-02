package com.rgbcraft.baumod.main.handlers;

import com.rgbcraft.baumod.main.Main;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler {
	    @ForgeSubscribe
	    public void onSound(SoundLoadEvent event)
	    {
	        try
	        {
	            event.manager.soundPoolSounds.addSound("telefono", Main.class.getResource("/com/rgbcraft/baumod/sound/tel.wav"));
	            System.out.println("[Eyecandycraft] Suono registrato");
	       
	        }
	        catch (Exception e)
	        {
	            System.err.println("Failed to register one or more sounds.");
	        }
	    }
}
