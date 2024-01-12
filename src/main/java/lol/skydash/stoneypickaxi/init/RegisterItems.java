package lol.skydash.stoneypickaxi.init;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterItems extends RegisterVar {

    public static void register() {
        // Items
        GameRegistry.registerItem(stoneyUnknown, "stoneyUnknown");
        GameRegistry.registerItem(stoneyDiamond, "stoneyDiamond");
        GameRegistry.registerItem(stoneyIron, "stoneyIron");
        // Normal pickaxe
        GameRegistry.registerItem(stoneyPickaxi, "stoneypickaxi");
    }
}
