package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemAluminumIngot extends Item 
{
    public ItemAluminumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("aluminumIngot", this);

        this.setUnlocalizedName("aluminumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}