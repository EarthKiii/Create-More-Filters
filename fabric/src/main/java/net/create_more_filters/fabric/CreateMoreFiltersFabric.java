package net.create_more_filters.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.create_more_filters.ExampleBlocks;
import net.create_more_filters.CreateMoreFilters;
import net.fabricmc.api.ModInitializer;

public class CreateMoreFiltersFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateMoreFilters.init();
        CreateMoreFilters.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), Create_More_Filters.NAME);
        // on fabric, Registrates must be explicitly finalized and registered.
        ExampleBlocks.REGISTRATE.register();
    }
}
