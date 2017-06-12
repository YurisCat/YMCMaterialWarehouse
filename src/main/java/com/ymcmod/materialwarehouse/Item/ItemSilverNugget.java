package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSilverNugget extends Item 
{
    public ItemSilverNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetSilver", this);
        
        this.setUnlocalizedName("silverNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
