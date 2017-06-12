package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemGoldPlates extends Item 
{
    public ItemGoldPlates()
    {
    	super();
    	
    	OreDictionary.registerOre("plateGold", this);

        this.setUnlocalizedName("goldPlates");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
