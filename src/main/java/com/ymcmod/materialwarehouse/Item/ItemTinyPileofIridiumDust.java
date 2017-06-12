package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofIridiumDust extends Item 
{
    public ItemTinyPileofIridiumDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyIridium", this);
        
        this.setUnlocalizedName("tinyPileofIridiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}