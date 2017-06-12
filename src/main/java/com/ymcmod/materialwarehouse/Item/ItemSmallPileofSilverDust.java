package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofSilverDust extends Item 
{
    public ItemSmallPileofSilverDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallSilver", this);
        
        this.setUnlocalizedName("smallPileofSilverDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}

