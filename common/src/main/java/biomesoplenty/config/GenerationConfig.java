/*******************************************************************************
 * Copyright 2024, the Glitchfiend Team.
 * All rights reserved.
 ******************************************************************************/
package biomesoplenty.config;

import biomesoplenty.core.BiomesOPlenty;
import glitchcore.config.Config;
import glitchcore.util.Environment;

public class GenerationConfig extends Config
{

    public int bopPrimaryOverworldRegionWeight;
    public int bopSecondaryOverworldRegionWeight;
    public int bopNetherRegionWeight;
    public int bopOverworldRareRegionWeight;
    public int bopNetherRareRegionWeight;

    public GenerationConfig()
    {
        super(Environment.getConfigPath().resolve(BiomesOPlenty.MOD_ID + "/generation.toml"));
    }

    @Override
    public void load()
    {
        bopPrimaryOverworldRegionWeight = addNumber("overworld.bop_primary_overworld_region_weight", 6, 0, Integer.MAX_VALUE, "The weighting of primary bop biome regions in the overworld. Lower values improve terrain generation speed.");
        bopSecondaryOverworldRegionWeight = addNumber("overworld.bop_secondary_overworld_region_weight", 4, 0, Integer.MAX_VALUE, "The weighting of secondary bop biome regions in the overworld. Lower values improve terrain generation speed.");
        bopOverworldRareRegionWeight = addNumber("overworld.bop_overworld_rare_region_weight", 1, 0, Integer.MAX_VALUE, "The weighting of rare bop biome regions in the overworld. Lower values improve terrain generation speed.");

        bopNetherRegionWeight = addNumber("nether.bop_nether_region_weight", 8, 0, Integer.MAX_VALUE, "The weighting of bop biome regions in the nether. Lower values improve terrain generation speed.");
        bopNetherRareRegionWeight = addNumber("nether.bop_nether_rare_region_weight", 1, 0, Integer.MAX_VALUE, "The weighting of rare bop biome regions in the nether. Lower values improve terrain generation speed.");
    }
}
