package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinyPileofLeadDust extends Item 
{
    public ItemTinyPileofLeadDust()
    {
        super();
        
        OreDictionary.registerOre("dustTinyLead", this);
        
        this.setUnlocalizedName("tinyPileofLeadDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}