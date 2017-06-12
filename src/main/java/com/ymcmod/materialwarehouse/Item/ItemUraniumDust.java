package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemUraniumDust extends Item 
{
    public ItemUraniumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustUranium", this);

        this.setUnlocalizedName("uraniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
