package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemMagnesiumDust extends Item 
{
    public ItemMagnesiumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustMagnesium", this);

        this.setUnlocalizedName("magnesiumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
