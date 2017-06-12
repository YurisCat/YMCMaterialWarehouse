package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTitaniumIngot extends Item 
{
    public ItemTitaniumIngot()
    {
    	super();
    	
    	OreDictionary.registerOre("titaniumIngot", this);

        this.setUnlocalizedName("titaniumIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}