package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedTungstenOre extends Item 
{
    public ItemCrushedTungstenOre()
    {
        super();
        
        OreDictionary.registerOre("crushedTungsten", this);
        
        this.setUnlocalizedName("crushedTungstenOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}