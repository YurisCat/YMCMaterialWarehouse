package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIridiumPlates extends Item 
{
    public ItemIridiumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateIridium", this);

        this.setUnlocalizedName("iridiumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
