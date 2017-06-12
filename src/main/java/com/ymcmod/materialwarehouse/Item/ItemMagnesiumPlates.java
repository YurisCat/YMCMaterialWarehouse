package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMagnesiumPlates extends Item 
{
    public ItemMagnesiumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateMagnesium", this);

        this.setUnlocalizedName("magnesiumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
