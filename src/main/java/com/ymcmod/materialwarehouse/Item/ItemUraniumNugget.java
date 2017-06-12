package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemUraniumNugget extends Item 
{
    public ItemUraniumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetUranium", this);
        
        this.setUnlocalizedName("uraniumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}