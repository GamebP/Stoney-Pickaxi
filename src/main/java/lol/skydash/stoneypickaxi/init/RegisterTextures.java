package lol.skydash.stoneypickaxi.init;

import lol.skydash.stoneypickaxi.StoneyPickaxi;
import lol.skydash.stoneypickaxi.tools.StoneyPickaxiPickaxe;
import lol.skydash.stoneypickaxi.utils.Reference;

public class RegisterTextures extends RegisterVar {

    public static void init() {
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
        // Tear 6
        stoneyPickaxi_six = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_SIX).setUnlocalizedName("stoneypickaxi_six")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_six");
        // Tear 7
        stoneyPickaxi_seven = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_SEVEN)
            .setUnlocalizedName("stoneypickaxi_seven")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_seven");
        // Tear 8
        stoneyPickaxi_eight = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_EIGHT)
            .setUnlocalizedName("stoneypickaxi_eight")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_eight");
        // Tear 9
        stoneyPickaxi_nine = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_NINE)
            .setUnlocalizedName("stoneypickaxi_nine")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_nine");
        // Tear 10
        stoneyPickaxi_ten = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_TEN).setUnlocalizedName("stoneypickaxi_ten")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_ten");
    }
}
