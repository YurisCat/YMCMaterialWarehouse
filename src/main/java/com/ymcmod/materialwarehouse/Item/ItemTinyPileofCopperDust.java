package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofCopperDust extends Item 
{
    public ItemTinyPileofCopperDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyCopper", this);
        
        this.setUnlocalizedName("tinyPileofCopperDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
