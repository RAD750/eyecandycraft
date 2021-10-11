package eyecandycraft.main.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import eyecandycraft.main.entities.TileEntityLightningRod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class LightningHandler {

	private static LightningHandler instance;
	
	private List<TileEntityLightningRod> lightningRods;
	private List<Entity> handledEntities;
	
	public static LightningHandler getInstance() {
		if(instance == null) {
			instance = new LightningHandler();
		}
		return instance;
	}
	
	private LightningHandler() {
		this.lightningRods = new ArrayList();
		this.handledEntities = new ArrayList();
	}
	
	public void registerLightningRod(TileEntityLightningRod lightningRod) {
		if(!this.lightningRods.contains(lightningRod)) {
			this.lightningRods.add(lightningRod);
		}
	}
	
	public void unregisterLightningRod(TileEntityLightningRod lightningRod) {
		this.lightningRods.remove(lightningRod);
	}
	
	
	@ForgeSubscribe
	public void onLightning(EntityJoinWorldEvent event) {
		Entity handledEntity = null;
		if(!this.handledEntities.contains(event.entity) && event.entity instanceof EntityLightningBolt) {
			Iterator it = this.lightningRods.iterator();
			while(it.hasNext()) {
				TileEntityLightningRod rod = (TileEntityLightningRod) it.next();
				double distance = event.entity.getDistance(rod.xCoord, rod.yCoord, rod.zCoord);
				if(rod.worldObj.equals(event.world) && distance < 100d) {
					if(rod.worldObj.canLightningStrikeAt(rod.xCoord, rod.yCoord+1, rod.zCoord)) {
						event.setCanceled(true);
						handledEntity = new EntityLightningBolt(rod.worldObj, rod.xCoord, rod.yCoord, rod.zCoord);
						this.handledEntities.add(handledEntity);
						rod.worldObj.addWeatherEffect(handledEntity);
						break;
					}
				}
			}
		}
		if(handledEntity != null) {
			this.handledEntities.remove(handledEntity);
		}
	}
}
