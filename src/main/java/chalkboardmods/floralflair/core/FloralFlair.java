package chalkboardmods.floralflair.core;

import chalkboardmods.floralflair.core.init.FloralBlocks;
import chalkboardmods.floralflair.core.init.FloralFeatures;
import chalkboardmods.floralflair.core.init.FloralGeneration;
import net.fabricmc.api.ModInitializer;

public class FloralFlair implements ModInitializer {

	public static final String MOD_ID = "floral_flair";

	@Override
	public void onInitialize() {
		FloralConfig.init();
		FloralBlocks.init();
		FloralFeatures.init();
		FloralGeneration.init();
	}

}
