package eyecandycraft.main.items.musicDisks;

import java.util.List;

import eyecandycraft.main.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class TimeForwardDisk
extends MusicDisk
{
public String recordName = "time-forward";
public static final String name = "Time, Forward!";

public TimeForwardDisk(int id)
{
  super(id, "time-forward");
  iconIndex = 3;
  recordName = "time-forward";
}


public String getRecordTitle()
{
  return "lego11 - " + recordName;
}

public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
{
  if ((par3World.getBlockId(par4, par5, par6) == Block.jukebox.blockID) && (par3World.getBlockMetadata(par4, par5, par6) == 0))
  {
    if (par3World.isRemote)
    {
      return true;
    }
    

    ((BlockJukeBox)Block.jukebox).insertRecord(par3World, par4, par5, par6, par1ItemStack);
    par3World.playAuxSFXAtEntity((EntityPlayer)null, 1005, par4, par5, par6, itemID);
    par1ItemStack.stackSize -= 1;
    return true;
  }
  


  return false;
}



public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
{
  par3List.add("Time, Forward!");
}
}
