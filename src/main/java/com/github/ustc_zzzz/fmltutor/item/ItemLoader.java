package com.github.ustc_zzzz.fmltutor.item;


import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader
{
    public static Item goldenEgg = new ItemGoldenEgg();
    public static Item techEgg = new ItemTechEgg();
    
    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(goldenEgg, "golden_egg");
        register(techEgg,"tech_egg");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(goldenEgg);
        registerRender(techEgg);
    }

    private static void register(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
    }
}