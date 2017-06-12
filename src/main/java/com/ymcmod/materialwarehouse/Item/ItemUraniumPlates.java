package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemUraniumPlates extends Item 
{
    public ItemUraniumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateUranium", this);

        this.setUnlocalizedName("uraniumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}