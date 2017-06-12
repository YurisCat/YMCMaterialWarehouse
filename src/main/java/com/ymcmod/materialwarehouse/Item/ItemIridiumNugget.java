package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIridiumNugget extends Item 
{
    public ItemIridiumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetIridium", this);
        
        this.setUnlocalizedName("iridiumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}