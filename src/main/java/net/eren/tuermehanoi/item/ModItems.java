package net.eren.tuermehanoi.item;

import net.eren.tuermehanoi.TrmeVonHannoi;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static  final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TrmeVonHannoi.MOD_ID, name), item);
    }



    public static void registerModItems(){
        TrmeVonHannoi.LOGGER.info("Registering Mod Items for" + TrmeVonHannoi.MOD_ID);
    }
}
