package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTungstenNugget extends Item 
{
    public ItemTungstenNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetTungsten", this);
        
        this.setUnlocalizedName("tungstenNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}

