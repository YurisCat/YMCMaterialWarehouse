package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinNugget extends Item 
{
    public ItemTinNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetTin", this);
        
        this.setUnlocalizedName("tinNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}