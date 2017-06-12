package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemPlatinumPlates extends Item 
{
    public ItemPlatinumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("platePlatinum", this);

        this.setUnlocalizedName("platinumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
