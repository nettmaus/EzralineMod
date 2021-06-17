package com.github.nettmaus.ezraline.data.client;

import com.github.nettmaus.ezraline.Ezraline;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Ezraline.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("blaustoff_block", modLoc("block/blaustoff_block"));
        withExistingParent("blaustoff_ore", modLoc("block/blaustoff_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "blaustoff_ingot");
    }
    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
