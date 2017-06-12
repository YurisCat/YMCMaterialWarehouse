package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofPlatinumDust extends Item 
{
    public ItemSmallPileofPlatinumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallPlatinum", this);
        
        this.setUnlocalizedName("smallPileofPlatinumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
