package lol.skydash.stoneypickaxi.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterSmelting {

    public static void RegRecepies() {
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            addSmelting(
                RegisterItems.stoneyPickaxi_five,
                lol.skydash.stoneyingotaxi.init.RegisterItems.stoneyRubbish,
                2);
        }
    }

    public static void addSmelting(Item inputItem, Item outputItem, float xp) {
        GameRegistry.addSmelting(inputItem, new ItemStack(outputItem), xp);
    }
}
