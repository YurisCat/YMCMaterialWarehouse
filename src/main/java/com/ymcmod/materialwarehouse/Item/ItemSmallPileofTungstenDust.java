package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofTungstenDust extends Item 
{
    public ItemSmallPileofTungstenDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallTungsten", this);
        
        this.setUnlocalizedName("smallPileofTungstenDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}