package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofMagnesiumDust extends Item 
{
    public ItemTinyPileofMagnesiumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyMagnesium", this);
        
        this.setUnlocalizedName("tinyPileofMagnesiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}