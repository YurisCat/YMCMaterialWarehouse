package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedTinOre extends Item 
{
    public ItemCrushedTinOre()
    {
        super();
        
        OreDictionary.registerOre("crushedTin", this);
        
        this.setUnlocalizedName("crushedTinOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}