package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMagnesiumNugget extends Item 
{
    public ItemMagnesiumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetMagnesium", this);
        
        this.setUnlocalizedName("magnesiumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}