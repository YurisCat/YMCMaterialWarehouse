package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIridiumIngot extends Item 
{
    public ItemIridiumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("iridiumIngot", this);

        this.setUnlocalizedName("iridiumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}