package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofPlatinumDust extends Item 
{
    public ItemTinyPileofPlatinumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyPlatinum", this);
        
        this.setUnlocalizedName("tinyPileofPlatinumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}