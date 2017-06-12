package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofTungstenDust extends Item 
{
    public ItemTinyPileofTungstenDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyTungsten", this);
        
        this.setUnlocalizedName("tinyPileofTungstenDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}