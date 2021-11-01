package com.example.examplemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;
import java.util.stream.Collectors;
import com.example.examplemod.item.ModItems;
import com.example.examplemod.block.ModBlocks;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
class ExampleMod() {
  // Directly reference a log4j logger.
  val LOGGER : Logger = LogManager.getLogger();

  // Register the setup method for modloading
  var eventBus : IEventBus  = FMLJavaModLoadingContext.get().getModEventBus();

  ModItems.register(eventBus);
  ModBlocks.register(eventBus);
    
  //eventBus.addListener(this.setup(_));
    
    
  // Register ourselves for server and other game events we are interested in
  MinecraftForge.EVENT_BUS.register(this);

  @SubscribeEvent
  def setup(event : FMLCommonSetupEvent) {
    // some preinit code
    LOGGER.info("HELLO FROM PREINIT");
    LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
  }
}
