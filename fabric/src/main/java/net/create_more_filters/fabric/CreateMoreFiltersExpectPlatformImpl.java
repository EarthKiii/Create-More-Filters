package net.create_more_filters.fabric;

import net.fabricmc.loader.api.FabricLoader;

public class CreateMoreFiltersExpectPlatformImpl {
	public static String platformName() {
		return FabricLoader.getInstance().isModLoaded("quilt_loader") ? "Quilt" : "Fabric";
	}
}
