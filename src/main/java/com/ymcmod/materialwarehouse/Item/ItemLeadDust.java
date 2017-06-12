package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemLeadDust extends Item 
{
    public ItemLeadDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustLead", this);

        this.setUnlocalizedName("leadDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}