package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofTinDust extends Item 
{
    public ItemSmallPileofTinDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallTin", this);
        
        this.setUnlocalizedName("smallPileofTinDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}

