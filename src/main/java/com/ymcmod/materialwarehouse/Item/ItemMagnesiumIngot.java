package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMagnesiumIngot extends Item 
{
    public ItemMagnesiumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("magnesiumIngot", this);

        this.setUnlocalizedName("magnesiumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}