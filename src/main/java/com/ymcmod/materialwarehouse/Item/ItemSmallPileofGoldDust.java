package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofGoldDust extends Item 
{
    public ItemSmallPileofGoldDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallGoldDust", this);
        
        this.setUnlocalizedName("smallPileofGoldDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}

