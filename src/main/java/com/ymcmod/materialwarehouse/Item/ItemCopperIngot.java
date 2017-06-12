package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCopperIngot extends Item 
{
    public ItemCopperIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("copperIngot", this);

        this.setUnlocalizedName("copperIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}