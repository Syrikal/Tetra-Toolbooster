package syric.toolbooster;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(
        modid = "toolbooster",
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ToolboosterItems {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Toolbooster.MODID);

    static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

    public static final RegistryObject<Item> TOOLBOOSTER = ITEMS.register("toolbooster",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> LEGEND_TOOLBOOSTER = ITEMS.register("legend_toolbooster",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> HAMMER_TOOLBOOSTER = ITEMS.register("hammer_toolbooster",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));
    public static final RegistryObject<Item> CREATIVE_TOOLBOOSTER = ITEMS.register("creative_toolbooster",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    @SubscribeEvent
    public static void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.getEntries().put(new ItemStack(TOOLBOOSTER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(new ItemStack(LEGEND_TOOLBOOSTER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(new ItemStack(HAMMER_TOOLBOOSTER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().put(new ItemStack(CREATIVE_TOOLBOOSTER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }

}
