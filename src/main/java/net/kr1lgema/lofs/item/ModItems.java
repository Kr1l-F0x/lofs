package net.kr1lgema.lofs.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kr1lgema.lofs.LightOfStar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

//Я НЕ МОГУ ГОВОРИТЬ!!!
public class ModItems {
    public static final Item STAR_FRAGMENT = registerItem("star_fragment", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(LightOfStar.MOD_ID, name), item);
    }

    public static void registerModItems(){
        LightOfStar.LOGGER.info("Register Mod Items for " + LightOfStar.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(STAR_FRAGMENT);
        });
    }
}
