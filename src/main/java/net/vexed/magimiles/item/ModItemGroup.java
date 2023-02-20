package net.vexed.magimiles.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.vexed.magimiles.MagiMiles;

public class ModItemGroup {
    public static ItemGroup SPELLBOOKS;
    public static void registerItemGroups() {
        SPELLBOOKS = FabricItemGroup.builder(new Identifier(MagiMiles.MOD_ID, "spellbooks"))
                .displayName(Text.translatable("itemgroup.spellbooks"))
                .icon(() -> new ItemStack(ModItems.HELLISH_RESIDUE)).build();
    }
}
