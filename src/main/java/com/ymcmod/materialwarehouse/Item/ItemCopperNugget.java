package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCopperNugget extends Item 
{
    public ItemCopperNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetCopper", this);
        
        this.setUnlocalizedName("copperNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
