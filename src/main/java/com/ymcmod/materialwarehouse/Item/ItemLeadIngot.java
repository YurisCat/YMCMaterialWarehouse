package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class ItemLeadIngot extends Item
{
	
	 public ItemLeadIngot()
	    {
	    	super();
	    	
	    	OreDictionary.registerOre("leadIngot", this);

	        this.setUnlocalizedName("copperIngot");
	        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
	    }
}
