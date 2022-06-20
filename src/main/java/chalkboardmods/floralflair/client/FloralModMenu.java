package chalkboardmods.floralflair.client;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import chalkboardmods.floralflair.core.FloralConfig;
import me.shedaniel.autoconfig.AutoConfig;

public class FloralModMenu implements ModMenuApi {

	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> {
			return AutoConfig.getConfigScreen(FloralConfig.class, parent).get();
		};
	}

}
