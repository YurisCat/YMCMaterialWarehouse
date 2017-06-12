package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedIronOre extends Item 
{
    public ItemCrushedIronOre()
    {
        super();
        
        OreDictionary.registerOre("crushedIron", this);
        
        this.setUnlocalizedName("crushedIronOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
