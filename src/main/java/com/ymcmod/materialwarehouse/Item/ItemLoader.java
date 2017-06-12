package com.ymcmod.materialwarehouse.Item;

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
    public static Item copperIngot = new ItemCopperIngot();
    public static Item tinIngot = new ItemTinIngot();
    public static Item leadIngot = new ItemLeadIngot();
    public static Item silverIngot = new ItemSilverIngot();
    public static Item nickelIngot = new ItemNickelIngot();
    public static Item tungstenIngot = new ItemTungstenIngot();
    public static Item platinumIngot = new ItemPlatinumIngot();
    public static Item titaniumIngot = new ItemTitaniumIngot();
    public static Item magnesiumIngot = new ItemMagnesiumIngot();
    public static Item aluminumIngot = new ItemAluminumIngot();
    public static Item uraniumIngot = new ItemUraniumIngot();
    public static Item iridiumIngot = new ItemIridiumIngot();
    
    public static Item ironPlates = new ItemIronPlates();
    public static Item goldPlates = new ItemGoldPlates();
    public static Item copperPlates = new ItemCopperPlates();
    public static Item tinPlates = new ItemTinPlates();
    public static Item leadPlates = new ItemLeadPlates();
    public static Item silverPlates = new ItemSilverPlates();
    public static Item nickelPlates = new ItemNickelPlates();
    public static Item tungstenPlates = new ItemTungstenPlates();
    public static Item platinumPlates = new ItemPlatinumPlates();
    public static Item titaniumPlates = new ItemTitaniumPlates();
    public static Item magnesiumPlates = new ItemMagnesiumPlates();
    public static Item aluminumPlates = new ItemAluminumPlates();
    public static Item uraniumPlates = new ItemUraniumPlates();
    public static Item iridiumPlates = new ItemIridiumPlates();
    
    public static Item ironDust = new ItemIronDust();
    public static Item goldDust = new ItemGoldDust();
    public static Item copperDust = new ItemCopperDust();
    public static Item tinDust = new ItemTinDust();
    public static Item leadDust = new ItemLeadDust();
    public static Item silverDust = new ItemSilverDust();
    public static Item nickelDust = new ItemNickelDust();
    public static Item tungstenDust = new ItemTungstenDust();
    public static Item platinumDust = new ItemPlatinumDust();
    public static Item titaniumDust = new ItemTitaniumDust();
    public static Item magnesiumDust = new ItemMagnesiumDust();
    public static Item aluminumDust = new ItemAluminumDust();
    public static Item uraniumDust = new ItemUraniumDust();
    public static Item iridiumDust = new ItemIridiumDust();
    
    public static Item smallPileofIronDust = new ItemSmallPileofIronDust();
    public static Item smallPileofGoldDust = new ItemSmallPileofGoldDust();
    public static Item smallPileofCopperDust = new ItemSmallPileofCopperDust();
    public static Item smallPileofTinDust = new ItemSmallPileofTinDust();
    public static Item smallPileofLeadDust = new ItemSmallPileofLeadDust();
    public static Item smallPileofSilverDust = new ItemSmallPileofSilverDust();
    public static Item smallPileofNickelDust = new ItemSmallPileofNickelDust();
    public static Item smallPileofTungstenDust = new ItemSmallPileofTungstenDust();
    public static Item smallPileofPlatinumDust = new ItemSmallPileofPlatinumDust();
    public static Item smallPileofTitaniumDust = new ItemSmallPileofTitaniumDust();
    public static Item smallPileofMagnesiumDust = new ItemSmallPileofMagnesiumDust();
    public static Item smallPileofAluminumDust = new ItemSmallPileofAluminumDust();
    public static Item smallPileofUraniumDust = new ItemSmallPileofUraniumDust();
    public static Item smallPileofIridiumDust = new ItemSmallPileofIridiumDust();
    
    public static Item tinyPileofIronDust = new ItemTinyPileofIronDust();
    public static Item tinyPileofGoldDust = new ItemTinyPileofGoldDust();
    public static Item tinyPileofCopperDust = new ItemTinyPileofCopperDust();
    public static Item tinyPileofTinDust = new ItemTinyPileofTinDust();
    public static Item tinyPileofLeadDust = new ItemTinyPileofLeadDust();
    public static Item tinyPileofSilverDust = new ItemTinyPileofSilverDust();
    public static Item tinyPileofNickelDust = new ItemTinyPileofNickelDust();
    public static Item tinyPileofTungstenDust = new ItemTinyPileofTungstenDust();
    public static Item tinyPileofPlatinumDust = new ItemTinyPileofPlatinumDust();
    public static Item tinyPileofTitaniumDust = new ItemTinyPileofTitaniumDust();
    public static Item tinyPileofMagnesiumDust = new ItemTinyPileofMagnesiumDust();
    public static Item tinyPileofAluminumDust = new ItemTinyPileofAluminumDust();
    public static Item tinyPileofUraniumDust = new ItemTinyPileofUraniumDust();
    public static Item tinyPileofIridiumDust = new ItemTinyPileofIridiumDust();
    
    public static Item ironNugget = new ItemIronNugget();
    public static Item copperNugget = new ItemCopperNugget();
    public static Item tinNugget = new ItemTinNugget();
    public static Item leadNugget = new ItemLeadNugget();
    public static Item silverNugget = new ItemSilverNugget();
    public static Item nickelNugget = new ItemNickelNugget();
    public static Item tungstenNugget = new ItemTungstenNugget();
    public static Item platinumNugget = new ItemPlatinumNugget();
    public static Item titaniumNugget = new ItemTitaniumNugget();
    public static Item magnesiumNugget = new ItemMagnesiumNugget();
    public static Item aluminumNugget = new ItemAluminumNugget();
    public static Item uraniumNugget = new ItemUraniumNugget();
    public static Item iridiumNugget = new ItemIridiumNugget();
    
    public static Item crushedIronOre = new ItemCrushedIronOre();
    public static Item crushedGoldOre = new ItemCrushedGoldOre();
    public static Item crushedCopperOre = new ItemCrushedCopperOre();
    public static Item crushedTinOre = new ItemCrushedTinOre();
    public static Item crushedLeadOre = new ItemCrushedLeadOre();
    public static Item crushedSilverOre = new ItemCrushedSilverOre();
    public static Item crushedNickelOre = new ItemCrushedNickelOre();
    public static Item crushedTungstenOre = new ItemCrushedTungstenOre();
    public static Item crushedPlatinumOre = new ItemCrushedPlatinumOre();
    public static Item crushedTitaniumOre = new ItemCrushedTitaniumOre();
    public static Item crushedMagnesiumOre = new ItemCrushedMagnesiumOre();
    public static Item crushedAluminumOre = new ItemCrushedAluminumOre();
    public static Item crushedUraniumOre = new ItemCrushedUraniumOre();
    public static Item crushedIridiumOre = new ItemCrushedIridiumOre();
    
    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(copperIngot, "copper_ingot");
        register(tinIngot, "tin_ingot");
        register(leadIngot, "lead_ingot");
        register(silverIngot, "silver_ingot");
        register(nickelIngot, "nickel_ingot");
        register(tungstenIngot, "tungsten_ingot");
        register(platinumIngot, "platinum_ingot");
        register(titaniumIngot, "titanium_ingot");
        register(magnesiumIngot, "magnesium_ingot");
        register(aluminumIngot, "aluminum_ingot");
        register(uraniumIngot, "uranium_ingot");
        register(iridiumIngot, "iridium_ingot");
        
        register(ironPlates, "iron_plates");
        register(goldPlates, "gold_plates");
        register(copperPlates, "copper_plates");
        register(tinPlates, "tin_plates");
        register(leadPlates, "lead_plates");
        register(silverPlates, "silver_plates");
        register(nickelPlates, "nickel_plates");
        register(tungstenPlates, "tungsten_plates");
        register(platinumPlates, "platinum_plates");
        register(titaniumPlates, "titanium_plates");
        register(magnesiumPlates, "magnesium_plates");
        register(aluminumPlates, "aluminum_plates");
        register(uraniumPlates, "uranium_plates");
        register(iridiumPlates, "iridium_plates");
        
        register(ironDust, "iron_dust");
        register(goldDust, "gold_dust");
        register(copperDust, "copper_dust");
        register(tinDust, "tin_dust");
        register(leadDust, "lead_dust");
        register(silverDust, "silver_dust");
        register(nickelDust, "nickel_dust");
        register(tungstenDust, "tungsten_dust");
        register(platinumDust, "platinum_dust");
        register(titaniumDust, "titanium_dust");
        register(magnesiumDust, "magnesium_dust");
        register(aluminumDust, "aluminum_dust");
        register(uraniumDust, "uranium_dust");
        register(iridiumDust, "iridium_dust");
        
        register(smallPileofIronDust, "smallpileofiron_dust");
        register(smallPileofGoldDust, "smallpileofgold_dust");
        register(smallPileofCopperDust, "smallpileofcopper_dust");
        register(smallPileofTinDust, "smallpileoftin_dust");
        register(smallPileofLeadDust, "smallpileoflead_dust");
        register(smallPileofSilverDust, "smallpileofsilver_dust");
        register(smallPileofNickelDust, "smallpileofnickel_dust");
        register(smallPileofTungstenDust, "smallpileoftungsten_dust");
        register(smallPileofPlatinumDust, "smallpileofplatinum_dust");
        register(smallPileofTitaniumDust, "smallpileoftitanium_dust");
        register(smallPileofMagnesiumDust, "smallpileofmagnesium_dust");
        register(smallPileofAluminumDust, "smallpileofaluminum_dust");
        register(smallPileofUraniumDust, "smallpileofuranium_dust");
        register(smallPileofIridiumDust, "smallpileofiridium_dust");
        
        register(tinyPileofIronDust, "tinypileofiron_dust");
        register(tinyPileofGoldDust, "tinypileofgold_dust");
        register(tinyPileofCopperDust, "tinypileofcopper_dust");
        register(tinyPileofTinDust, "tinypileoftin_dust");
        register(tinyPileofLeadDust, "tinypileoflead_dust");
        register(tinyPileofSilverDust, "tinypileofsilver_dust");
        register(tinyPileofNickelDust, "tinypileofnickel_dust");
        register(tinyPileofTungstenDust, "tinypileoftungsten_dust");
        register(tinyPileofPlatinumDust, "tinypileofplatinum_dust");
        register(tinyPileofTitaniumDust, "tinypileoftitanium_dust");
        register(tinyPileofMagnesiumDust, "tinypileofmagnesium_dust");
        register(tinyPileofAluminumDust, "tinypileofaluminum_dust");
        register(tinyPileofUraniumDust, "tinypileofuranium_dust");
        register(tinyPileofIridiumDust, "tinypileofiridium_dust");
        
        register(ironNugget, "iron_nugget");
        register(copperNugget, "copper_nugget");
        register(tinNugget, "tin_nugget");
        register(leadNugget, "lead_nugget");
        register(silverNugget, "silver_nugget");
        register(nickelNugget, "nickel_nugget");
        register(tungstenNugget, "tungsten_nugget");
        register(platinumNugget, "platinum_nugget");
        register(titaniumNugget, "titanium_nugget");
        register(magnesiumNugget, "magnesium_nugget");
        register(aluminumNugget, "aluminum_nugget");
        register(uraniumNugget, "uranium_nugget");
        register(iridiumNugget, "iridium_nugget");
        
        register(crushedIronOre, "crushediron_ore");
        register(crushedGoldOre, "crushedgold_ore");
        register(crushedCopperOre, "crushedcopper_ore");
        register(crushedTinOre, "crushedtin_ore");
        register(crushedLeadOre, "crushedlead_ore");
        register(crushedSilverOre, "crushedsilver_ore");
        register(crushedNickelOre, "crushednickel_ore");
        register(crushedTungstenOre, "crushedtungsten_ore");
        register(crushedPlatinumOre, "crushedplatinum_ore");
        register(crushedTitaniumOre, "crushedtitanium_ore");
        register(crushedMagnesiumOre, "crushedmagnesium_ore");
        register(crushedAluminumOre, "crushedaluminum_ore");
        register(crushedUraniumOre, "crusheduranium_ore");
        register(crushedIridiumOre, "crushediridium_ore");
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {

    	registerRender(copperIngot);
        registerRender(tinIngot);
        registerRender(leadIngot);
        registerRender(silverIngot);
        registerRender(nickelIngot);
        registerRender(tungstenIngot);
        registerRender(platinumIngot);
        registerRender(titaniumIngot);
        registerRender(magnesiumIngot);
        registerRender(aluminumIngot);
        registerRender(uraniumIngot);
        registerRender(iridiumIngot);
        
    	registerRender(ironPlates);
    	registerRender(goldPlates);
        registerRender(copperPlates);
        registerRender(tinPlates);
        registerRender(leadPlates);
        registerRender(silverPlates);
        registerRender(nickelPlates);
        registerRender(tungstenPlates);
        registerRender(platinumPlates);
        registerRender(titaniumPlates);
        registerRender(magnesiumPlates);
        registerRender(aluminumPlates);
        registerRender(uraniumPlates);
        registerRender(iridiumPlates);
        
    	registerRender(ironDust);
    	registerRender(goldDust);
        registerRender(copperDust);
        registerRender(tinDust);
        registerRender(leadDust);
        registerRender(silverDust);
        registerRender(nickelDust);
        registerRender(tungstenDust);
        registerRender(platinumDust);
        registerRender(titaniumDust);
        registerRender(magnesiumDust);
        registerRender(aluminumDust);
        registerRender(uraniumDust);
        registerRender(iridiumDust);
        
    	registerRender(smallPileofIronDust);
    	registerRender(smallPileofGoldDust);
        registerRender(smallPileofCopperDust);
        registerRender(smallPileofTinDust);
        registerRender(smallPileofLeadDust);
        registerRender(smallPileofSilverDust);
        registerRender(smallPileofNickelDust);
        registerRender(smallPileofTungstenDust);
        registerRender(smallPileofPlatinumDust);
        registerRender(smallPileofTitaniumDust);
        registerRender(smallPileofMagnesiumDust);
        registerRender(smallPileofAluminumDust);
        registerRender(smallPileofUraniumDust);
        registerRender(smallPileofIridiumDust);
        
    	registerRender(tinyPileofIronDust);
    	registerRender(tinyPileofGoldDust);
        registerRender(tinyPileofCopperDust);
        registerRender(tinyPileofTinDust);
        registerRender(tinyPileofLeadDust);
        registerRender(tinyPileofSilverDust);
        registerRender(tinyPileofNickelDust);
        registerRender(tinyPileofTungstenDust);
        registerRender(tinyPileofPlatinumDust);
        registerRender(tinyPileofTitaniumDust);
        registerRender(tinyPileofMagnesiumDust);
        registerRender(tinyPileofAluminumDust);
        registerRender(tinyPileofUraniumDust);
        registerRender(tinyPileofIridiumDust);
        
    	registerRender(ironNugget);
        registerRender(copperNugget);
        registerRender(tinNugget);
        registerRender(leadNugget);
        registerRender(silverNugget);
        registerRender(nickelNugget);
        registerRender(tungstenNugget);
        registerRender(platinumNugget);
        registerRender(titaniumNugget);
        registerRender(magnesiumNugget);
        registerRender(aluminumNugget);
        registerRender(uraniumNugget);
        registerRender(iridiumNugget);
        
    	registerRender(crushedIronOre);
    	registerRender(crushedGoldOre);
        registerRender(crushedCopperOre);
        registerRender(crushedTinOre);
        registerRender(crushedLeadOre);
        registerRender(crushedSilverOre);
        registerRender(crushedNickelOre);
        registerRender(crushedTungstenOre);
        registerRender(crushedPlatinumOre);
        registerRender(crushedTitaniumOre);
        registerRender(crushedMagnesiumOre);
        registerRender(crushedAluminumOre);
        registerRender(crushedUraniumOre);
        registerRender(crushedIridiumOre);
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