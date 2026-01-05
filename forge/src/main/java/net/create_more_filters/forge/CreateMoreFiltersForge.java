package net.create_more_filters.forge;

import net.create_more_filters.ExampleBlocks;
import net.create_more_filters.CreateMoreFilters;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateMoreFilters.MOD_ID)
public class CreateMoreFiltersForge {
    public CreateMoreFiltersForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExampleBlocks.REGISTRATE.registerEventListeners(eventBus);
        CreateMoreFilters.init();
    }
}
