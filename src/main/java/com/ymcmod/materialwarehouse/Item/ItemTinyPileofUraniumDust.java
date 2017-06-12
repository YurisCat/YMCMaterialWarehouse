package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofUraniumDust extends Item 
{
    public ItemTinyPileofUraniumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyUranium", this);
        
        this.setUnlocalizedName("tinyPileofUraniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}