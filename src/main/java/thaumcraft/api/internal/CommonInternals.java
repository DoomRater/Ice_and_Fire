package thaumcraft.api.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.ThaumcraftApi.SmeltBonus;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.IThaumcraftRecipe;

/**
 * @author Azanor
 *
 * Internal variables and methods used by Thaumcraft and the api that should normally not be accessed directly by addon mods.
 *
 */
public class CommonInternals {
	
	public static HashMap<String,ResourceLocation> jsonLocs = new  HashMap<>();
	public static ArrayList<ThaumcraftApi.EntityTags> scanEntities = new ArrayList<>();	
	public static HashMap<ResourceLocation,IThaumcraftRecipe> craftingRecipeCatalog = new HashMap<>();
	public static HashMap<ResourceLocation,Object> craftingRecipeCatalogFake = new HashMap<>();
	public static ArrayList<SmeltBonus> smeltingBonus = new ArrayList<SmeltBonus>();
	public static ConcurrentHashMap<String,AspectList> objectTags = new ConcurrentHashMap<>();
	public static ConcurrentHashMap<String,int[]> groupedObjectTags = new ConcurrentHashMap<>();	 
	public static HashMap<Object,Integer> warpMap = new HashMap<Object,Integer>();
	public static HashMap<String,ItemStack> seedList = new HashMap<String,ItemStack>();
	
	public static IThaumcraftRecipe getCatalogRecipe(ResourceLocation key) {	
		return craftingRecipeCatalog.get(key);
	}
	
	public static Object getCatalogRecipeFake(ResourceLocation key) {	
		return craftingRecipeCatalogFake.get(key);
	}
	
}
