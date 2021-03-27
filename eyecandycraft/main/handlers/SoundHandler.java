package eyecandycraft.main.handlers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eyecandycraft.main.Main;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
/*@SideOnly(Side.CLIENT)
public class SoundHandler {

    public SoundHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @ForgeSubscribe
    public void onSoundsLoad(SoundLoadEvent event) {
        for (Sounds sound : Sounds.values()) {
        	System.out.println("SEI SCEMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
            this.addSound(event, sound);
        }
    }

    private void addSound(SoundLoadEvent event, Sounds sound) {
    	System.out.println("SEI SCEMOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOo");
        event.manager.soundPoolSounds.addSound("eyecandycraft/" + sound.getName() + ".ogg", Main.class.getResource("/eyecandycraft/sound/" + sound.getName() + ".ogg"));
    }

}
*/