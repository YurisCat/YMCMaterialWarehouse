package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofIridiumDust extends Item 
{
    public ItemSmallPileofIridiumDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallIridium", this);
        
        this.setUnlocalizedName("smallPileofIridiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
