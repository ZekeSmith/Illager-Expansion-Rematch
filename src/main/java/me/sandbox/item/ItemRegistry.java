package me.sandbox.item;

import me.sandbox.IllagerExpansion;
import me.sandbox.entity.EntityRegistry;
import me.sandbox.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    //GENERAL ITEMS
    public static final Item UNUSUAL_DUST = registerItem("unusual_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item ILLUSIONARY_DUST = registerItem("illusionary_dust",
            new IllusionaryDustItem(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item HORN_OF_SIGHT = registerItem("horn_of_sight",
            new HornOfSightItem(new FabricItemSettings().group(ModItemGroup.SandBoxMisc).maxCount(1)));
    public static final Item HALLOWED_GEM = registerItem("hallowed_gem",
            new Item(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item PRIMAL_ESSENCE = registerItem("primal_essence",
            new Item(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_CHUNK = registerItem("platinum_chunk",
            new Item(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_SHEET = registerItem("platinum_sheet",
            new Item(new FabricItemSettings().group(ModItemGroup.SandBoxMisc)));
    public static final Item FIRECALLER_BELT = registerItem("firecaller_belt",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc).maxCount(1)));


    //TOOLS
    public static final Item HATCHET = registerItem("hatchet",
            new HatchetItem(new FabricItemSettings().maxDamage(250).group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_PICKAXE = registerItem("platinum_infused_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.PLATINUM_INFUSED_NETHERITE, 1, -2.8f, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_AXE = registerItem("platinum_infused_netherite_axe",
            new ModAxeItem(ModToolMaterial.PLATINUM_INFUSED_NETHERITE, 5, -3.0f, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_HOE = registerItem("platinum_infused_netherite_hoe",
            new ModHoeItem(ModToolMaterial.PLATINUM_INFUSED_NETHERITE, -2, 0.0f, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_SWORD = registerItem("platinum_infused_netherite_sword",
            new SwordItem(ModToolMaterial.PLATINUM_INFUSED_NETHERITE, 3, -2.4f, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_SHOVEL = registerItem("platinum_infused_netherite_shovel",
            new ShovelItem(ModToolMaterial.PLATINUM_INFUSED_NETHERITE, 1.5f, -3.0f, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));

    //ARMOR
    public static final Item PLATINUM_INFUSED_NETHERITE_HELMET = registerItem("platinum_infused_netherite_helmet",
            new ArmorItem(ModArmorMaterial.PLATINUM_INFUSED_NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_CHESTPLATE = registerItem("platinum_infused_netherite_chestplate",
            new ArmorItem(ModArmorMaterial.PLATINUM_INFUSED_NETHERITE, EquipmentSlot.CHEST, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_LEGGINGS = registerItem("platinum_infused_netherite_leggings",
            new ArmorItem(ModArmorMaterial.PLATINUM_INFUSED_NETHERITE, EquipmentSlot.LEGS, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));
    public static final Item PLATINUM_INFUSED_NETHERITE_BOOTS = registerItem("platinum_infused_netherite_boots",
            new ArmorItem(ModArmorMaterial.PLATINUM_INFUSED_NETHERITE, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(ModItemGroup.SandBoxMisc)));


    //SPAWN EGGS
    public static final Item PROVOKER_SPAWN_EGG = registerItem("provoker_spawn_egg",
            new SpawnEggItem(EntityRegistry.PROVOKER,9541270,9399876, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item SURRENDERED_SPAWN_EGG = registerItem("surrendered_spawn_egg",
            new SpawnEggItem(EntityRegistry.SURRENDERED,11260369,11858160, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item BASHER_SPAWN_EGG = registerItem("basher_spawn_egg",
            new SpawnEggItem(EntityRegistry.BASHER,9541270,5985087, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item SORCERER_SPAWN_EGG = registerItem("sorcerer_spawn_egg",
            new SpawnEggItem(EntityRegistry.SORCERER,9541270,10899592, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item ARCHIVIST_SPAWN_EGG = registerItem("archivist_spawn_egg",
            new SpawnEggItem(EntityRegistry.ARCHIVIST,9541270,13251893, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item ILLAGER_BRUTE_SPAWN_EGG = registerItem("inquisitor_spawn_egg",
            new SpawnEggItem(EntityRegistry.INQUISITOR,9541270,4934471, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item MARAUDER_SPAWN_EGG = registerItem("marauder_spawn_egg",
            new SpawnEggItem(EntityRegistry.MARAUDER,5441030,9541270, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item ALCHEMIST_SPAWN_EGG = registerItem("alchemist_spawn_egg",
            new SpawnEggItem(EntityRegistry.ALCHEMIST,9541270,7550099, new Item.Settings().group(ModItemGroup.SandBoxMobs)));
    public static final Item FIRECALLER_SPAWN_EGG = registerItem("firecaller_spawn_egg",
            new SpawnEggItem(EntityRegistry.FIRECALLER,9541270,14185784, new Item.Settings().group(ModItemGroup.SandBoxMobs)));



    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(IllagerExpansion.MOD_ID, name), item);
    }


    public static void registerModItems() {
    }
}
