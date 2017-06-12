package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedCopperOre extends Item 
{
    public ItemCrushedCopperOre()
    {
        super();
        
        OreDictionary.registerOre("crushedCopper", this);
        
        this.setUnlocalizedName("crushedCopperOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}