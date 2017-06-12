package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemPlatinumDust extends Item 
{
    public ItemPlatinumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustPlatinum", this);

        this.setUnlocalizedName("platinumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
