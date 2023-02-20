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
    public static final Item HELLISH_RESIDUE = registerItem("hellish_residue",
            new Item(new FabricItemSettings()));
    public static final Item INFERNAL_GUNK = registerItem("infernal_gunk",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MagiMiles.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, HELLISH_RESIDUE);
        addToItemGroup(ItemGroups.INGREDIENTS, INFERNAL_GUNK);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        MagiMiles.LOGGER.info("Registering Mod Items for " + MagiMiles.MOD_ID);

        addItemsToItemGroup();
    }
}
