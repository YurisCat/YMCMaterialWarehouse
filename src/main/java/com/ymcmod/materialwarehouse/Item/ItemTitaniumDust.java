package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTitaniumDust extends Item 
{
    public ItemTitaniumDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustTitanium", this);

        this.setUnlocalizedName("titaniumDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
