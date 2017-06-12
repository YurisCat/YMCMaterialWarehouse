package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemCrushedLeadOre extends Item 
{
    public ItemCrushedLeadOre()
    {
        super();
        
        OreDictionary.registerOre("crushedLead", this);
        
        this.setUnlocalizedName("crushedLeadOre");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}