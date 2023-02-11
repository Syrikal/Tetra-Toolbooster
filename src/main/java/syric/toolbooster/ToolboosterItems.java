package syric.toolbooster;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import se.mickelus.tetra.items.TetraItemGroup;

public class ToolboosterItems {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Toolbooster.MODID);

    static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> TOOLBOOSTER = ITEMS.register("toolbooster",
            () -> new Item(new Item.Properties().tab(TetraItemGroup.instance).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LEGEND_TOOLBOOSTER = ITEMS.register("legend_toolbooster",
            () -> new Item(new Item.Properties().tab(TetraItemGroup.instance).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> HAMMER_TOOLBOOSTER = ITEMS.register("hammer_toolbooster",
            () -> new Item(new Item.Properties().tab(TetraItemGroup.instance).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CREATIVE_TOOLBOOSTER = ITEMS.register("creative_toolbooster",
            () -> new Item(new Item.Properties().tab(TetraItemGroup.instance).rarity(Rarity.EPIC)));


}
