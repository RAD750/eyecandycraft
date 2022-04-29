package eyecandycraft.main.handlers;


import java.lang.reflect.Field;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThirstModHandler {
	public static Item getThirstModItem(String itemName) {
		Item item = null;
		        try {
		            Class drinkLoader = Class.forName("tarun1998.thirstmod.common.items.DrinkLoader");
		            Field itemField = drinkLoader.getField(itemName);
		            Object itemObj = itemField.get(null);
		            if(itemObj instanceof Item) {
		                item = (Item) itemObj;
		            }
		        } catch (ClassNotFoundException e) {
		            e.printStackTrace();
		        } catch (NoSuchFieldException e) {
		            e.printStackTrace();
		        } catch (SecurityException e) {
		            e.printStackTrace();
		        } catch (IllegalArgumentException e) {
		            e.printStackTrace();
		        } catch (IllegalAccessException e) {
		            e.printStackTrace();
		        }
		return item;
		}
}