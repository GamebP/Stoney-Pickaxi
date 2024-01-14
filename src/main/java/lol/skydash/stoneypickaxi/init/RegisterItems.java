package lol.skydash.stoneypickaxi.init;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterItems extends RegisterVar {

    public static void register() {
        GameRegistry.registerItem(stoneyPickaxi, "stoneypickaxi");
        GameRegistry.registerItem(stoneyPickaxi_one, "stoneypickaxi_one");
        GameRegistry.registerItem(stoneyPickaxi_two, "stoneypickaxi_two");
        GameRegistry.registerItem(stoneyPickaxi_three, "stoneypickaxi_three");
        GameRegistry.registerItem(stoneyPickaxi_four, "stoneypickaxi_four");
        GameRegistry.registerItem(stoneyPickaxi_five, "stoneypickaxi_five");
    }
}
