package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofIronDust extends Item 
{
    public ItemSmallPileofIronDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallIronDust", this);
        
        this.setUnlocalizedName("smallPileofIronDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}