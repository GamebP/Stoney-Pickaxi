package lol.skydash.stoneypickaxi.init;

import lol.skydash.stoneypickaxi.StoneyPickaxi;
import lol.skydash.stoneypickaxi.items.StoneyDiamondItem;
import lol.skydash.stoneypickaxi.items.StoneyIronItem;
import lol.skydash.stoneypickaxi.items.StoneyUnknownItem;
import lol.skydash.stoneypickaxi.tools.StoneyPickaxiPickaxe;
import lol.skydash.stoneypickaxi.utils.Reference;

public class RegisterTextures extends RegisterVar {

    public static void init() {
        // Items
        stoneyUnknown = new StoneyUnknownItem().setUnlocalizedName("stoneyUnknown")
            .setCreativeTab(StoneyPickaxi.StoneyItemTab)
            .setTextureName(Reference.MOD_ID + ":stoney_unknown");
        stoneyDiamond = new StoneyDiamondItem().setUnlocalizedName("stoneyDiamond")
            .setCreativeTab(StoneyPickaxi.StoneyItemTab)
            .setTextureName(Reference.MOD_ID + ":stoney_diamond");
        stoneyIron = new StoneyIronItem().setUnlocalizedName("stoneyIron")
            .setCreativeTab(StoneyPickaxi.StoneyItemTab)
            .setTextureName(Reference.MOD_ID + ":stoney_iron");

        // Normal pickaxe
        stoneyPickaxi = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL).setUnlocalizedName("stoneypickaxi")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi");
        // Tier 1
        stoneyPickaxi_one = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_ONE).setUnlocalizedName("stoneypickaxi_one")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_one");
        // Tear 2
        stoneyPickaxi_two = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_TWO).setUnlocalizedName("stoneypickaxi_two")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_two");
        // Tear 3
        stoneyPickaxi_three = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_THREE)
            .setUnlocalizedName("stoneypickaxi_three")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_three");
        // Tear 4
        stoneyPickaxi_four = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_FOUR)
            .setUnlocalizedName("stoneypickaxi_four")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_four");
        // Tear 5
        stoneyPickaxi_five = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_FIVE)
            .setUnlocalizedName("stoneypickaxi_five")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_five");
    }
}
