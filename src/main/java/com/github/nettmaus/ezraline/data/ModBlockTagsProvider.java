package com.github.nettmaus.ezraline.data;

import com.github.nettmaus.ezraline.Ezraline;
import com.github.nettmaus.ezraline.setup.ModBlocks;
import com.github.nettmaus.ezraline.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, Ezraline.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(){
        tag(ModTags.Blocks.ORES_BLAUSTOFF).add(ModBlocks.BLAUSTOFF_ORE.get());
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_BLAUSTOFF);
        tag(ModTags.Blocks.STORAGE_BLOCKS_BLAUSTOFF).add(ModBlocks.BLAUSTOFF_BLOCK.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_BLAUSTOFF);    }
}
