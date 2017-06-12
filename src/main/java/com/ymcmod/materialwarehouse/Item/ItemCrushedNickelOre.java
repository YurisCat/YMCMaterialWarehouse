package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedNickelOre extends Item 
{
    public ItemCrushedNickelOre()
    {
        super();
        
        OreDictionary.registerOre("crushedNickel", this);
        
        this.setUnlocalizedName("crushedNickelOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}