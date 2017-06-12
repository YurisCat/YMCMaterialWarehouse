package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemNickelPlates extends Item 
{
    public ItemNickelPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateNickel", this);

        this.setUnlocalizedName("nickelPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
