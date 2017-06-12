package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofAluminumDust extends Item 
{
    public ItemTinyPileofAluminumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyAluminum", this);
        
        this.setUnlocalizedName("tinyPileofAluminumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}