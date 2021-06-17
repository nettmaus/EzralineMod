package com.github.nettmaus.ezraline.setup;


import com.github.nettmaus.ezraline.Ezraline;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_BLAUSTOFF = forge("ores/blaustoff");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_BLAUSTOFF = forge("storage_blocks/blaustoff");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }
        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(Ezraline.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_BLAUSTOFF = forge("ores/blaustoff");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_BLAUSTOFF = forge("storage_blocks/blaustoff");

        public static final ITag.INamedTag<Item> INGOTS_BLAUSTOFF = forge("ingots/blaustoff");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(Ezraline.MOD_ID, path).toString());
        }
    }
}
