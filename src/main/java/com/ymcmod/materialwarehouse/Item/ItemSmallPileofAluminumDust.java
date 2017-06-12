package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofAluminumDust extends Item 
{
    public ItemSmallPileofAluminumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallAluminum", this);
        
        this.setUnlocalizedName("smallPileofAluminumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
