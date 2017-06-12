package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemAluminumNugget extends Item 
{
    public ItemAluminumNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetAluminum", this);
        
        this.setUnlocalizedName("aluminumNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}