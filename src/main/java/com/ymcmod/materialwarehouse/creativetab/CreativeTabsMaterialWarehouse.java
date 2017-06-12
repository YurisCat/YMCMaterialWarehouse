package com.ymcmod.materialwarehouse.creativetab;


import com.ymcmod.materialwarehouse.Item.ItemLoader;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabsMaterialWarehouse extends CreativeTabs
{
    public CreativeTabsMaterialWarehouse()
    {
        super("materialwarehouse");
    }

    @Override
    public Item getTabIconItem()
    {
        return ItemLoader.copperIngot;
    }
}