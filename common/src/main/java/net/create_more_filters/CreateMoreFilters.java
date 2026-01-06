package net.create_more_filters;

import com.simibubi.create.Create;
import net.create_more_filters.attributes.ItemNameMatchesRegexAttribute;
import net.create_more_filters.attributes.NameRegexAttribute;
import net.create_more_filters.attributes.TagMatchesRegexAttribute;
import net.create_more_filters.attributes.TagRegexAttribute;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateMoreFilters {
    public static final String MOD_ID = "create_more_filters";
    public static final String NAME = "Create: More Filters";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);


    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, CreateMoreFiltersExpectPlatform.platformName());
        ItemAttributeRegistry.register("tag_regex", new TagMatchesRegexAttribute(".*Sword.*"));
        ItemAttributeRegistry.register("name_regex", new ItemNameMatchesRegexAttribute(".*Sword.*"));
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
