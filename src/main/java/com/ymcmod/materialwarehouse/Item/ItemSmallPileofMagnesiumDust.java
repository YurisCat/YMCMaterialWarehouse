package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofMagnesiumDust extends Item 
{
    public ItemSmallPileofMagnesiumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallMagnesium", this);
        
        this.setUnlocalizedName("smallPileofMagnesiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
