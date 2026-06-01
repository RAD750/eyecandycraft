// 
// Decompiled by Procyon v0.5.36
// 

package appeng.api;

import appeng.api.me.util.IAssemblerPattern;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.ReflectionHelper;
import appeng.api.me.util.IMEInventoryUtil;
import appeng.api.me.util.IMEInventory;
import java.lang.reflect.Method;

public class Util
{
    private static Method isBlankPattern;
    private static Method isPattern;
    private static Method getPattern;
    private static Method isAssemblerPattern;
    private static Method getAssemblerPattern;
    private static Method isLocationPattern;
    private static Method getLocationPattern;
    private static Method isCell;
    private static Method GetCell;
    private static Method addBasicBlackList;
    private static Method GetCellArray;
    private static Method getWrapper;
    private static Method getCellRegistry;
    private static Method getExternalStorageRegistry;
    private static Method getGrinderRecipeManage;
    private static Method getIMEInventoryUtil;
    private static Method updateGridAt;
    
    public static IMEInventoryUtil getIMEInventoryUtil(final IMEInventory ime) {
        try {
            if (Util.getIMEInventoryUtil == null) {
                Util.getIMEInventoryUtil = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.common.AppEng" }).getMethod("getIMEInventoryUtil", (Class[])new Class[0]);
            }
            return (IMEInventoryUtil)Util.getIMEInventoryUtil.invoke(null, ime);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static void updateGridAt(final World w, final int x, final int y, final int z) {
        try {
            if (Util.updateGridAt == null) {
                Util.updateGridAt = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.common.AppEng" }).getMethod("updateGridAt", World.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            }
            Util.updateGridAt.invoke(null, w, x, y, z);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static IExternalStorageRegistry getExternalStorageRegistry() {
        try {
            if (Util.getExternalStorageRegistry == null) {
                Util.getExternalStorageRegistry = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.common.AppEng" }).getMethod("getExternalStorageRegistry", (Class[])new Class[0]);
            }
            return (IExternalStorageRegistry)Util.getExternalStorageRegistry.invoke(null, new Object[0]);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static ICellRegistry getCellRegistry() {
        try {
            if (Util.getCellRegistry == null) {
                Util.getCellRegistry = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.common.AppEng" }).getMethod("getCellRegistry", (Class[])new Class[0]);
            }
            return (ICellRegistry)Util.getCellRegistry.invoke(null, new Object[0]);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static IGrinderRecipeManager getGrinderRecipeManage() {
        try {
            if (Util.getGrinderRecipeManage == null) {
                Util.getGrinderRecipeManage = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.common.AppEng" }).getMethod("getGrinderRecipeManage", (Class[])new Class[0]);
            }
            return (IGrinderRecipeManager)Util.getGrinderRecipeManage.invoke(null, new Object[0]);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean isBlankPattern(final ItemStack i) {
        try {
            if (Util.isBlankPattern == null) {
                Util.isBlankPattern = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.AssemblerPatternInventory" }).getMethod("isBlankPattern", ItemStack.class);
            }
            return (Boolean)Util.isBlankPattern.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean isLocationPattern(final ItemStack i) {
        try {
            if (Util.isLocationPattern == null) {
                Util.isLocationPattern = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.LocationPatternInventory" }).getMethod("isLocationPattern", ItemStack.class);
            }
            return (Boolean)Util.isLocationPattern.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean isAssemblerPattern(final ItemStack i) {
        try {
            if (Util.isAssemblerPattern == null) {
                Util.isAssemblerPattern = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.AssemblerPatternInventory" }).getMethod("isAssemblerPattern", ItemStack.class);
            }
            return (Boolean)Util.isAssemblerPattern.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static IAssemblerPattern getAssemblerPattern(final ItemStack i) {
        try {
            if (Util.getAssemblerPattern == null) {
                Util.getAssemblerPattern = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.AssemblerPatternInventory" }).getMethod("getAssemblerPattern", ItemStack.class);
            }
            return (IAssemblerPattern)Util.getAssemblerPattern.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean isBasicCell(final ItemStack i) {
        try {
            if (Util.isCell == null) {
                Util.isCell = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.CellInventory" }).getMethod("isCell", ItemStack.class);
            }
            return (Boolean)Util.isCell.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static Boolean isCell(final ItemStack i) {
        return getCellRegistry().isCellHandled(i);
    }
    
    public static IMEInventory getCell(final ItemStack i) {
        return getCellRegistry().getHandlerForCell(i);
    }
    
    public static IMEInventory getBasicCell(final ItemStack i) {
        try {
            if (i == null) {
                return null;
            }
            if (Util.GetCell == null) {
                Util.GetCell = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.CellInventory" }).getMethod("getCell", ItemStack.class);
            }
            return (IMEInventory)Util.GetCell.invoke(null, i);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static void addBasicBlackList(final int ItemID, final int Meta) {
        try {
            if (Util.addBasicBlackList == null) {
                Util.addBasicBlackList = ReflectionHelper.getClass(Util.class.getClassLoader(), new String[] { "appeng.me.CellInventory" }).getMethod("addBasicBlackList", Integer.TYPE, Integer.TYPE);
            }
            Util.addBasicBlackList.invoke(null, ItemID, Meta);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    static {
        Util.isBlankPattern = null;
        Util.isPattern = null;
        Util.getPattern = null;
        Util.isAssemblerPattern = null;
        Util.getAssemblerPattern = null;
        Util.isLocationPattern = null;
        Util.getLocationPattern = null;
        Util.isCell = null;
        Util.GetCell = null;
        Util.addBasicBlackList = null;
        Util.GetCellArray = null;
        Util.getWrapper = null;
        Util.getCellRegistry = null;
        Util.getExternalStorageRegistry = null;
        Util.getGrinderRecipeManage = null;
        Util.getIMEInventoryUtil = null;
        Util.updateGridAt = null;
    }
}
