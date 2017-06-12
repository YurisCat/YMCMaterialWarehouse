package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSilverDust extends Item 
{
    public ItemSilverDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustSilver", this);

        this.setUnlocalizedName("silverDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
