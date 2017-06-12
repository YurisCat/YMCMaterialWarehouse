package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemPlatinumNugget extends Item 
{
    public ItemPlatinumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetPlatinum", this);
        
        this.setUnlocalizedName("platinumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}