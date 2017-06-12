package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofTitaniumDust extends Item 
{
    public ItemTinyPileofTitaniumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyTitanium", this);
        
        this.setUnlocalizedName("tinyPileofTitaniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}