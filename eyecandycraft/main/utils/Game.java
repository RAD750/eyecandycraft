package eyecandycraft.main.utils;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * @author CovertJaguar <railcraft.wikispaces.com>
 */
public class Game {

    private static final Logger log = Logger.getLogger("Eyecandycraft");

    static {
        log.setParent(FMLCommonHandler.instance().getFMLLogger());
    }

    public static boolean isHost(World world) {
        return !world.isRemote;
    }

    public static boolean isNotHost(World world) {
        return world.isRemote;
    }

    @SideOnly(Side.CLIENT)
    public static World getWorld() {
        Minecraft mc = FMLClientHandler.instance().getClient();
        if (mc != null) {
            return mc.theWorld;
        }
        return null;
    }

    public static boolean isObfuscated() {
        return !World.class.getSimpleName().equals("World");
    }

    public static Item getItemByName(String name) {
        for (int i = 0; i < Item.itemsList.length; i++) {
            if (Item.itemsList[i] != null && Item.itemsList[i].getItemName() != null) {
                if (Item.itemsList[i].getItemName().equals(name)) {
                    return Item.itemsList[i];
                }
            }
        }
        return null;
    }

    public static Block getBlockByName(String name) {
        for (int i = 0; i < Block.blocksList.length; i++) {
            if (Block.blocksList[i] != null && Block.blocksList[i].getBlockName() != null) {
                if (Block.blocksList[i].getBlockName().equals(name)) {
                    return Block.blocksList[i];
                }
            }
        }

        return null;
    }

    public static void log(Level level, String msg, Object... params) {
        String m = msg;

        for (int i = 0; i < params.length; i++) {
            if (params[i] == null) continue;
            m = m.replace("{" + i + "}", params[i].toString());
        }

        log.log(level, m);
    }

    public static void logErrorAPI(String mod, Throwable error) {
        StringBuilder msg = new StringBuilder(mod);
        msg.append(" API error, please update your mods. Error: ").append(error);
        StackTraceElement[] stackTrace = error.getStackTrace();
        if (stackTrace.length > 0) {
            msg.append(", ").append(stackTrace[0]);
        }
        log.log(Level.SEVERE, msg.toString());
    }

    public static void logError(String msg, Throwable error) {
        log.log(Level.SEVERE, msg, error);
    }

    public static void logErrorFingerprint(String mod) {
        StringBuilder msg = new StringBuilder(mod);
        msg.append(" failed validation, terminating. Please re-download ").append(mod).append(".");
        log.log(Level.SEVERE, msg.toString());
    }

    public static int getDirection(TileEntity tileentity) {
        int direction;
        direction = tileentity.getWorldObj().getBlockMetadata(tileentity.xCoord, tileentity.yCoord,
                tileentity.zCoord) + 1;
        if (direction == 1) {
            direction = 3;
        } else if (direction == 3) {
            direction = 1;
        } else if (direction == 2) {
            direction = 4;
        } else if (direction == 4) {
            direction = 2;
        }
        return direction;
    }
}
