package com.github.nettmaus.ezraline.data;

import com.github.nettmaus.ezraline.Ezraline;
import com.github.nettmaus.ezraline.setup.ModBlocks;
import com.github.nettmaus.ezraline.setup.ModItems;
import com.github.nettmaus.ezraline.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, Ezraline.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags() {
        copy(ModTags.Blocks.ORES_BLAUSTOFF, ModTags.Items.ORES_BLAUSTOFF);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        copy(ModTags.Blocks.STORAGE_BLOCKS_BLAUSTOFF, ModTags.Items.STORAGE_BLOCKS_BLAUSTOFF);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        tag(ModTags.Items.INGOTS_BLAUSTOFF).add(ModItems.BLAUSTOFF_INGOT.get());
        tag(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_BLAUSTOFF);
    }
}
