package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTitaniumNugget extends Item 
{
    public ItemTitaniumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetTitanium", this);
        
        this.setUnlocalizedName("titaniumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}