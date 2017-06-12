package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedTitaniumOre extends Item 
{
    public ItemCrushedTitaniumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedTitanium", this);
        
        this.setUnlocalizedName("crushedTitaniumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}