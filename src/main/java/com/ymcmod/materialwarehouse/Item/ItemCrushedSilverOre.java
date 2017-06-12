package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedSilverOre extends Item 
{
    public ItemCrushedSilverOre()
    {
        super();
        
        OreDictionary.registerOre("crushedSilver", this);
        
        this.setUnlocalizedName("crushedSilverOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}