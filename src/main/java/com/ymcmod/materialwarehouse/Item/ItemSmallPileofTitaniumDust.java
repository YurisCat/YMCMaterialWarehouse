package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofTitaniumDust extends Item 
{
    public ItemSmallPileofTitaniumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallTitanium", this);
        
        this.setUnlocalizedName("smallPileofTitaniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
