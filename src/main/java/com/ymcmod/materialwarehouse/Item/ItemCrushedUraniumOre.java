package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedUraniumOre extends Item 
{
    public ItemCrushedUraniumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedUranium", this);
        
        this.setUnlocalizedName("crushedUraniumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}