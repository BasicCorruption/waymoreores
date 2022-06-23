package dev.sidgames.wmo.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class CopperOre extends BlockBase {
    public CopperOre(Settings settings) {
        super(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F));
    }
}

