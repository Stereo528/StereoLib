package com.stereo528.stereolib;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StereoLib implements ModInitializer {
	public static final String MODID = "stereolib";
	public static final Logger LOGGER = LoggerFactory.getLogger("StereoLib");

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello world from {}!", mod.metadata().name());
	}
}
