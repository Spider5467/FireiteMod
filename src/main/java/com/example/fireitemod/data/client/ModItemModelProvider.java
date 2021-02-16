package com.example.fireitemod.data.client;

import com.example.fireitemod.setup.ModItems;
import com.example.fireitemod.setup.blocks.ModSimpleBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.example.fireitemod.ExampleMod.MOD_ID;

public class ModItemModelProvider extends ItemModelProvider {


    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModSimpleBlocks.ALL_SIMPLE_BLOCKS.forEach(sb -> registerBlock(sb.getId().getPath()));
        registerItem(ModItems.FIREITE_INGOT.getId().getPath());
        registerItem(ModItems.FIREITE_HELMET.getId().getPath());
        registerItem(ModItems.FIREITE_CHESTPLATE.getId().getPath());
        registerItem(ModItems.FIREITE_LEGGINGS.getId().getPath());
        registerItem(ModItems.FIREITE_BOOTS.getId().getPath());
        registerItem(ModItems.FIREITE_ARMOR.getId().getPath());
    }

    private void registerItem(String path_name) {
        ModelFile modelFile = getExistingFile(mcLoc("item/generated"));
        getBuilder(path_name).parent(modelFile).texture("layer0", "item/".concat(path_name));
    }

    private void registerBlock(String path_name) {
        withExistingParent(path_name, modLoc("block/".concat(path_name)));
    }
}
