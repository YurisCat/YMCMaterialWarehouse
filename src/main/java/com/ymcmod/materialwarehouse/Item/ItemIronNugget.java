package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIronNugget extends Item 
{
    public ItemIronNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetIron", this);
        
        this.setUnlocalizedName("ironNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}