package net.vexed.magimiles.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.vexed.magimiles.MagiMiles;

public class ModItems {
    //ITEMS
    public static final Item HELLISH_RESIDUE = registerItem("hellish_residue",
            new Item(new FabricItemSettings()));
    public static final Item INFERNAL_GUNK = registerItem("infernal_gunk",
            new Item(new FabricItemSettings()));


    //SPELL TOMES
    public static final Item BLANK_TOME = registerItem("blank_tome",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item FLAME_RUSH_TOME = registerItem("flame_rush_tome",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item SURGE_OF_FROST_TOME = registerItem("surge_of_frost_tome",
            new Item(new FabricItemSettings().maxCount(1)));
    public static final Item POISON_VOLLEY_TOME = registerItem("poison_volley_tome",
            new Item(new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagiMiles.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, HELLISH_RESIDUE);
        addToItemGroup(ItemGroups.INGREDIENTS, INFERNAL_GUNK);
        addToItemGroup(ModItemGroup.SPELLBOOKS, BLANK_TOME);
        addToItemGroup(ModItemGroup.SPELLBOOKS, FLAME_RUSH_TOME);
        addToItemGroup(ModItemGroup.SPELLBOOKS, SURGE_OF_FROST_TOME);
        addToItemGroup(ModItemGroup.SPELLBOOKS, POISON_VOLLEY_TOME);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        MagiMiles.LOGGER.info("Registering Mod Items for " + MagiMiles.MOD_ID);

        addItemsToItemGroup();
    }
}
