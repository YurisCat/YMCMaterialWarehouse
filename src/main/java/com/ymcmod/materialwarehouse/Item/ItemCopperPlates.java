package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCopperPlates extends Item 
{
    public ItemCopperPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateCopper", this);

        this.setUnlocalizedName("copperPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
