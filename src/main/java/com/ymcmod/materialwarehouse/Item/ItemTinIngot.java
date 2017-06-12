package com.ymcmod.materialwarehouse.Item;

import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class ItemTinIngot extends Item 
{
    public ItemTinIngot()
    {
        super();
        
        OreDictionary.registerOre("tinIngot", this);
        
        this.setUnlocalizedName("tinIngot");
        this.setCreativeTab(CreativeTabsLoader.tabMaterialWarehouse);
    }
}
