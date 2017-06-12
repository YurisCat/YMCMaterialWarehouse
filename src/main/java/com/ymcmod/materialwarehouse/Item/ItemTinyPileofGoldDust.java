package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofGoldDust extends Item 
{
    public ItemTinyPileofGoldDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyGold", this);
        
        this.setUnlocalizedName("tinyPileofGoldDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
