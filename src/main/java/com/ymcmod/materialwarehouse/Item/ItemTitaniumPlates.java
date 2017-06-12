package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTitaniumPlates extends Item 
{
    public ItemTitaniumPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateTitanium", this);

        this.setUnlocalizedName("titaniumPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
