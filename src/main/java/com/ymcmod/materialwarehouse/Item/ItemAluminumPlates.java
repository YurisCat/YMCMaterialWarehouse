package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemAluminumPlates extends Item 
{
    public ItemAluminumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateAluminum", this);

        this.setUnlocalizedName("aluminumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
