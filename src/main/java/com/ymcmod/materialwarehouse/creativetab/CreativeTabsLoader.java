package com.ymcmod.materialwarehouse.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader
{
    public static CreativeTabs tabMaterialWarehouse;

    public CreativeTabsLoader(FMLPreInitializationEvent event)
    {
    	tabMaterialWarehouse = new CreativeTabsMaterialWarehouse();
    }
}