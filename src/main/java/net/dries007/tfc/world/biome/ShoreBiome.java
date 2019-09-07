/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.world.biome;

import javax.annotation.Nonnull;

import net.minecraft.world.biome.Biome;

import net.dries007.tfc.world.gen.surfacebuilders.TFCSurfaceBuilders;
import net.dries007.tfc.world.noise.INoise2D;

import static net.dries007.tfc.world.gen.TFCOverworldChunkGenerator.SEA_LEVEL;

public class ShoreBiome extends TFCBiome
{
    public ShoreBiome()
    {
        super(new Biome.Builder().category(Category.BEACH).surfaceBuilder(TFCSurfaceBuilders.SHORE));

        TFCDefaultBiomeFeatures.addCarvers(this);
    }

    @Nonnull
    @Override
    public INoise2D createNoiseLayer(long seed)
    {
        return (x, z) -> SEA_LEVEL;
    }
}
