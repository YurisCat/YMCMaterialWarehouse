package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemGoldNugget extends Item 
{
    public ItemGoldNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetGold", this);
        
        this.setUnlocalizedName("goldNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}