package lol.skydash.stoneypickaxi.init;

import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterSmelting extends RegisterVar {

    public static void Smelting() {
        GameRegistry.addSmelting(stoneyPickaxi_five, new ItemStack(stoneyDiamond), 0.1F);
    }
}
