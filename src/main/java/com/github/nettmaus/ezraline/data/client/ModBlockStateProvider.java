package com.github.nettmaus.ezraline.data.client;

import com.github.nettmaus.ezraline.Ezraline;
import com.github.nettmaus.ezraline.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Ezraline.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.BLAUSTOFF_BLOCK.get());
        simpleBlock(ModBlocks.BLAUSTOFF_ORE.get());
    }
}

