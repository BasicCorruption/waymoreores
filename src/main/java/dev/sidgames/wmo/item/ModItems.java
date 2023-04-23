package dev.sidgames.wmo.item;

import dev.sidgames.wmo.Reference;
import dev.sidgames.wmo.item.functional.LeadIngot;
import dev.sidgames.wmo.item.tool.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ALUMINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BRONZE_ALLOY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ENDERITE_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ENDERITE_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LEAD_INGOT = new LeadIngot(new FabricItemSettings().group(ItemGroup.MATERIALS).food(WMOFoodComponents.LEAD_INGOT));
    public static final Item LITHIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PLATINUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item STARLITE_SHARD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item RUBY_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SAPPHIRE_GEM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item URANIUM_ROD = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ALUMINUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LEAD_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item LITHIUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PLATINUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SILVER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item STARLITE_DUST = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TIN_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item URANIUM_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item URANIUM_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    private static final Item COBALT_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    private static final Item COBALT_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    private static final Item ZINC_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    private static final Item ZINC_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));


    public static void registerItems() {
        // Register items here
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_ingot"), ALUMINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_nugget"), ALUMINUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_alloy"), BRONZE_ALLOY);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_dust"), ENDERITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_shard"), ENDERITE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_ingot"), LEAD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_nugget"), LEAD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_ingot"), LITHIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_nugget"), LITHIUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_ingot"), PLATINUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_nugget"), PLATINUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby"), RUBY_GEM);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire"), SAPPHIRE_GEM);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_ingot"), SILVER_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_nugget"), SILVER_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "starlite_shard"), STARLITE_SHARD);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "starlite_dust"), STARLITE_DUST);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_nugget"), TIN_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_ingot"), URANIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_nugget"), URANIUM_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "uranium_rod"), URANIUM_ROD);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "cobalt_ingot"), COBALT_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "cobalt_nugget"), COBALT_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "zinc_block"), ZINC_INGOT);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "zinc_ore"), ZINC_NUGGET);

        // Register tool items here
        /// Axes
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_axe"), new WMOAxeItem(WMOToolMaterials.ALUMINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_axe"), new WMOAxeItem(WMOToolMaterials.BRONZE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_axe"), new WMOAxeItem(WMOToolMaterials.LEAD, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_axe"), new WMOAxeItem(WMOToolMaterials.LITHIUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_axe"), new WMOAxeItem(WMOToolMaterials.PLATINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_axe"), new WMOAxeItem(WMOToolMaterials.RUBY, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_axe"), new WMOAxeItem(WMOToolMaterials.SAPPHIRE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_axe"), new WMOAxeItem(WMOToolMaterials.SILVER, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_axe"), new WMOAxeItem(WMOToolMaterials.TIN, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_axe"), new WMOAxeItem(WMOToolMaterials.ENDERITE, 2, 1.2f));

        /// Hoes
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_hoe"), new WMOHoeItem(WMOToolMaterials.ALUMINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_hoe"), new WMOHoeItem(WMOToolMaterials.BRONZE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_hoe"), new WMOHoeItem(WMOToolMaterials.LEAD, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_hoe"), new WMOHoeItem(WMOToolMaterials.LITHIUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_hoe"), new WMOHoeItem(WMOToolMaterials.PLATINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_hoe"), new WMOHoeItem(WMOToolMaterials.RUBY, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_hoe"), new WMOHoeItem(WMOToolMaterials.SAPPHIRE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_hoe"), new WMOHoeItem(WMOToolMaterials.SILVER, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_hoe"), new WMOHoeItem(WMOToolMaterials.TIN, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_hoe"), new WMOHoeItem(WMOToolMaterials.ENDERITE, 2, 1.2f));

        /// Pickaxes
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.ALUMINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.BRONZE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.LEAD, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.LITHIUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.PLATINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.RUBY, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.SAPPHIRE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.SILVER, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.TIN, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_pickaxe"), new WMOPickaxeItem(WMOToolMaterials.ENDERITE, 2, 1.2f));

        /// Shovels
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_shovel"), new WMOShovelItem(WMOToolMaterials.ALUMINUM, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_shovel"), new WMOShovelItem(WMOToolMaterials.BRONZE, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_shovel"), new WMOShovelItem(WMOToolMaterials.LEAD, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_shovel"), new WMOShovelItem(WMOToolMaterials.LITHIUM, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_shovel"), new WMOShovelItem(WMOToolMaterials.PLATINUM, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_shovel"), new WMOShovelItem(WMOToolMaterials.RUBY, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_shovel"), new WMOShovelItem(WMOToolMaterials.SAPPHIRE, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_shovel"), new WMOShovelItem(WMOToolMaterials.SILVER, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_shovel"), new WMOShovelItem(WMOToolMaterials.TIN, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_shovel"), new WMOShovelItem(WMOToolMaterials.ENDERITE, 2, 1.2f, new Item.Settings().group(ItemGroup.TOOLS)));

        /// Swords
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_sword"), new WMOSwordItem(WMOToolMaterials.ALUMINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_sword"), new WMOSwordItem(WMOToolMaterials.BRONZE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_sword"), new WMOSwordItem(WMOToolMaterials.LEAD, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_sword"), new WMOSwordItem(WMOToolMaterials.LITHIUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_sword"), new WMOSwordItem(WMOToolMaterials.PLATINUM, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_sword"), new WMOSwordItem(WMOToolMaterials.RUBY, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_sword"), new WMOSwordItem(WMOToolMaterials.SAPPHIRE, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_sword"), new WMOSwordItem(WMOToolMaterials.SILVER, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_sword"), new WMOSwordItem(WMOToolMaterials.TIN, 2, 1.2f));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "enderite_sword"), new WMOSwordItem(WMOToolMaterials.ENDERITE, 4, 0.4f));

        // Register armor here
        /// Helmets
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_helmet"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_helmet"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_helmet"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_helmet"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_helmet"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_helmet"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_helmet"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_helmet"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_helmet"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));

        /// Chestplates
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_chestplate"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_chestplate"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_chestplate"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_chestplate"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_chestplate"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_chestplate"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_chestplate"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_chestplate"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_chestplate"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT)));

        /// Leggings
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_leggings"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_leggings"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_leggings"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_leggings"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_leggings"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_leggings"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_leggings"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_leggings"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_leggings"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT)));

        /// Boots
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "aluminum_boots"), new ArmorItem(WMOArmorMaterials.ALUMINUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "bronze_boots"), new ArmorItem(WMOArmorMaterials.BRONZE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lead_boots"), new ArmorItem(WMOArmorMaterials.LEAD, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "lithium_boots"), new ArmorItem(WMOArmorMaterials.LITHIUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "platinum_boots"), new ArmorItem(WMOArmorMaterials.PLATINUM, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "ruby_boots"), new ArmorItem(WMOArmorMaterials.RUBY, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "sapphire_boots"), new ArmorItem(WMOArmorMaterials.SAPPHIRE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "silver_boots"), new ArmorItem(WMOArmorMaterials.SILVER, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "tin_boots"), new ArmorItem(WMOArmorMaterials.TIN, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT)));

        // special items
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, "technoblades_crown"), new ArmorItem(WMOArmorMaterials.TECHNOBLADE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT)));
    }

}
