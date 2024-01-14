package lol.skydash.stoneypickaxi;

import net.minecraftforge.common.MinecraftForge;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import lol.skydash.stoneypickaxi.init.RegisterItems;
import lol.skydash.stoneypickaxi.init.RegisterRecepies;
import lol.skydash.stoneypickaxi.init.RegisterTextures;
import lol.skydash.stoneypickaxi.proxy.CommonProxy;
import lol.skydash.stoneypickaxi.utils.PickaxiTabPickaxe;
import lol.skydash.stoneypickaxi.utils.Reference;

@Mod(
    modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.MOD_VERSION,
    acceptedMinecraftVersions = Reference.MC_VERSION,
    dependencies = "required-after:stoneyshovelaxi;required-after:stoneyingotaxi;")
public class StoneyPickaxi {

    @Mod.Instance(Reference.MOD_ID)
    public static StoneyPickaxi instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;
    public static PickaxiTabPickaxe StoneyPickaxeTab = new PickaxiTabPickaxe("stoneypickaxiTab");

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        RegisterTextures.init();
        RegisterItems.register();
        RegisterRecepies.Recepies();
    }

    public static class WorldLoadHandler {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.registerRenders();
        proxy.registerEntities();
    }
}
