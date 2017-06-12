package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinDust extends Item 
{
    public ItemTinDust()
    {
    	super();
    	
    	OreDictionary.registerOre("dustTin", this);

        this.setUnlocalizedName("tinDust");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
