package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTungstenPlates extends Item 
{
    public ItemTungstenPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateTungsten", this);

        this.setUnlocalizedName("tungstenPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}