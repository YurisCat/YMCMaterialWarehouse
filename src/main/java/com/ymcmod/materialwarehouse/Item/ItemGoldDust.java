package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemGoldDust extends Item 
{
    public ItemGoldDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustGold", this);

        this.setUnlocalizedName("goldDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
