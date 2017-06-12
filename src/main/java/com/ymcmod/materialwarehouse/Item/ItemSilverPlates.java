package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSilverPlates extends Item 
{
    public ItemSilverPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateSilver", this);

        this.setUnlocalizedName("silverPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}