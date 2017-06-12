package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofTinDust extends Item 
{
    public ItemTinyPileofTinDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyTin", this);
        
        this.setUnlocalizedName("tinyPileofTinDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}