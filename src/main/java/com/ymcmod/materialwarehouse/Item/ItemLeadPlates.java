package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemLeadPlates extends Item 
{
    public ItemLeadPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateLead", this);

        this.setUnlocalizedName("leadPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
