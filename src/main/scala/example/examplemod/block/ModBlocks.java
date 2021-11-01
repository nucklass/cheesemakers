package com.example.examplemod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
	DeferredRegister.create(ForgeRegistries.BLOCKS,"examplemod");

    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("cheeseblock",
									     () -> new Block(BlockBehaviour.Properties.of(Material.SPONGE).strength(12f)));

    //public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
    //									    () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f)));


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
	RegistryObject<T> toReturn = BLOCKS.register(name, block);
	registerBlockItem(name, toReturn);
	return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
	ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
							  new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    }

    public static void register(IEventBus eventBus) {
	BLOCKS.register(eventBus);
    }
}