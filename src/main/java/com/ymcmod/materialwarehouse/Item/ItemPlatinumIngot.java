package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemPlatinumIngot extends Item 
{
    public ItemPlatinumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("platinumIngot", this);

        this.setUnlocalizedName("platinumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}