package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinPlates extends Item 
{
    public ItemTinPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateTin", this);

        this.setUnlocalizedName("tinPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
