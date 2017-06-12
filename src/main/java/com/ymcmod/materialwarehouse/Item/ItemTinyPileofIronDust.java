package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofIronDust extends Item 
{
    public ItemTinyPileofIronDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyIron", this);
        
        this.setUnlocalizedName("tinyPileofIronDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}