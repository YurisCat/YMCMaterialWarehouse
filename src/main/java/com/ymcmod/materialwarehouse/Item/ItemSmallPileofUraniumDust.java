package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofUraniumDust extends Item 
{
    public ItemSmallPileofUraniumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallUranium", this);
        
        this.setUnlocalizedName("smallPileofUraniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}