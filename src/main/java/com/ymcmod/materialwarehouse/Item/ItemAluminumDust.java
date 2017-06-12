package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemAluminumDust extends Item 
{
    public ItemAluminumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustAluminum", this);

        this.setUnlocalizedName("aluminumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
