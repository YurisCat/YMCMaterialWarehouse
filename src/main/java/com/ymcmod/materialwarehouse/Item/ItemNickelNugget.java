package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemNickelNugget extends Item 
{
    public ItemNickelNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetNickel", this);
        
        this.setUnlocalizedName("nickelNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}