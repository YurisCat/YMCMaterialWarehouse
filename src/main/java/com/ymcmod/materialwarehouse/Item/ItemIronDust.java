package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemIronDust extends Item 
{
    public ItemIronDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustIron", this);

        this.setUnlocalizedName("ironDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}

