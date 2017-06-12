package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemLeadNugget extends Item 
{
    public ItemLeadNugget()
    {
        super();
        
        OreDictionary.registerOre("nuggetLead", this);
        
        this.setUnlocalizedName("leadNugget");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}