package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSmallPileofLeadDust extends Item 
{
    public ItemSmallPileofLeadDust()
    {
        super();
        
        OreDictionary.registerOre("dustSmallLead", this);
        
        this.setUnlocalizedName("smallPileofLeadDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
