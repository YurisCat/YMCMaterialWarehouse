package com.ymcmod.materialwarehouse;

import com.ymcmod.materialwarehouse.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author ustc_zzzz
 */
@Mod(modid = MaterialWarehouse.MODID, name = MaterialWarehouse.NAME, version = MaterialWarehouse.VERSION, acceptedMinecraftVersions = "1.8.9")
public class MaterialWarehouse
{
    public static final String MODID = "materialwarehouse";
    public static final String NAME = "Material Warehouse";
    public static final String VERSION = "1.0.0";

    @Instance(MaterialWarehouse.MODID)
    public static MaterialWarehouse instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    	// TODO
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    	// TODO
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    	// TODO
    }
    
    @SidedProxy(clientSide = "com.ymcmod.materialwarehouse.client.ClientProxy", 
            serverSide = "com.ymcmod.materialwarehouse.common.CommonProxy")
    public static CommonProxy proxy;
    //上面这个是代理
}
