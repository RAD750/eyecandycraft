package com.rgbcraft.baumod.main.proxies;

import java.net.URL;

import com.rgbcraft.baumod.main.Main;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler {
	 @ForgeSubscribe

	 public void onSound(SoundLoadEvent event) {

	 try {
     URL VoNRurl = new URL("http://172.16.20.235:8000/falkreath.ogg");
	 event.manager.soundPoolStreaming.addSound("VONR", VoNRurl);
	 System.out.println("Suoni attivati");
	 
	 } catch (Exception e) {

	 System.err.println("Failed to register one or more sounds.");

	 }
}
}