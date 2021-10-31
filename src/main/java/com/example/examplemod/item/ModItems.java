package com.example.examplemod.item;
 
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.example.examplemod.ExampleMod;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
	DeferredRegister.create(ForgeRegistries.ITEMS, "examplemod");

    public static final RegistryObject<Item> DEEZ_NUTS =
	ITEMS.register(
		       "deeznutz",
		       () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
		       );

	public static final RegistryObject<Item> CHEESIUM =
	ITEMS.register(
				"cheesium",
				() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
				);
    
	public static final RegistryObject<Item> CHEESECLOTH =
	ITEMS.register(
				"cheesecloth",
				() -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
				);

	public static final RegistryObject<Item> CHEESE_SLICE_ITEM = 
	ITEMS.register(
		"cheese_slice", 
		() -> new CheeseSliceItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT))
	);

	public static final RegistryObject<Item> PIZZA_ITEM = 
	ITEMS.register(
        "pizza",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );
    
    public static void register(IEventBus eventbus) {
		ITEMS.register(eventbus);
    }
}
