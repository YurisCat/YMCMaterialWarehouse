package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedIridiumOre extends Item 
{
    public ItemCrushedIridiumOre()
    {
        super();
        
        OreDictionary.registerOre("crushedIridium", this);
        
        this.setUnlocalizedName("crushedIridiumOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}