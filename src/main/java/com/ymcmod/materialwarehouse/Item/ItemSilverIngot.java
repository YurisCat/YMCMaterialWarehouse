package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSilverIngot extends Item 
{
    public ItemSilverIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("silverIngot", this);

        this.setUnlocalizedName("silverIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}