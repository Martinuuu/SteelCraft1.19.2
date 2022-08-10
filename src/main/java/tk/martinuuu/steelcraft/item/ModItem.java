package tk.martinuuu.steelcraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import tk.martinuuu.steelcraft.Steelcraft;

public class ModItem {

    public static final Item steel_ingot = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Steelcraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Steelcraft.LOGGER.debug("Registering Mod items for" + Steelcraft.MOD_ID);
    }
}
