package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIronPlates extends Item 
{
    public ItemIronPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateIron", this);

        this.setUnlocalizedName("ironPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}