package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemNickelIngot extends Item 
{
    public ItemNickelIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("nickelIngot", this);

        this.setUnlocalizedName("nickelIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}