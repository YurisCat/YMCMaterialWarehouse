package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedPlatinumOre extends Item 
{
    public ItemCrushedPlatinumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedPlatinum", this);
        
        this.setUnlocalizedName("crushedPlatinumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}