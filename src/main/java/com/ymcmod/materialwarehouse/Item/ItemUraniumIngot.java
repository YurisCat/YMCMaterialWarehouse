package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemUraniumIngot extends Item 
{
    public ItemUraniumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("uraniumIngot", this);

        this.setUnlocalizedName("uraniumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}