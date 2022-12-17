/*
 * Copyright (c) 2014.
 * Created by MrTJP.
 * All rights reserved.
 */
package mrtjp.relocationfmp

import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.event.{FMLInitializationEvent, FMLPostInitializationEvent, FMLPreInitializationEvent}
import org.apache.logging.log4j.LogManager

@Mod(modid = RelocationFMPMod.modID, useMetadata = true, modLanguage = "scala", acceptedMinecraftVersions = "[1.7.10]", dependencies = "required-after:ForgeRelocation;required-after:ForgeMultipart", name = RelocationFMPMod.modName, version = RelocationFMPMod.version)
object RelocationFMPMod
{
    final val modID = "RelocationFMP"
    final val modName = "RelocationFMP"
    final val version = "GRADLETOKEN_VERSION"

    val log = LogManager.getFormatterLogger(modID)

    @Mod.EventHandler
    def preInit(event:FMLPreInitializationEvent)
    {
        RelocationFMPProxy.preinit()
    }

    @Mod.EventHandler
    def init(event:FMLInitializationEvent)
    {
        RelocationFMPProxy.init()
    }

    @Mod.EventHandler
    def postInit(event:FMLPostInitializationEvent)
    {
        RelocationFMPProxy.postinit()
    }
}
