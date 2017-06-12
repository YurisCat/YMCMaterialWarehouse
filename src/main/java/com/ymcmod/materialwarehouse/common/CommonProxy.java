package com.ymcmod.materialwarehouse.common;

import com.ymcmod.materialwarehouse.Item.ItemLoader;
import com.ymcmod.materialwarehouse.creativetab.CreativeTabsLoader;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {

    	new CreativeTabsLoader(event); 
    	//创造模式物品栏
    	new ItemLoader(event);
    	//物品
    	//new OreDictionaryLoader(event);
    	//矿典
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}

//这个是代理