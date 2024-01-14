package lol.skydash.stoneypickaxi.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegisterRecepies extends RegisterVar {

    public static void Recepies() {
        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi, 1),
            "ALA",
            "CLC",
            " L ",
            'L',
            Items.stick,
            'A',
            Blocks.stone,
            'C',
            Blocks.cobblestone);
        // Tier 1 pickaxe

        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi_one, 1),
            "OOO",
            "OPO",
            "OOO",
            'P',
            new ItemStack(stoneyPickaxi, 1, 0),
            'O',
            Blocks.log);

        // Tier 2 pickaxe
        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi_two, 1),
            "OOO",
            "OPO",
            "OOO",
            'P',
            new ItemStack(stoneyPickaxi_one, 1, 0),
            'O',
            Blocks.coal_block);

        // Tier 3 pickaxe
        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi_three, 1),
            "NIL",
            "GPG",
            "LIN",
            'P',
            new ItemStack(stoneyPickaxi_two, 1, 0),
            'I',
            Blocks.iron_block,
            'G',
            Blocks.gold_block,
            'L',
            Items.golden_pickaxe,
            'N',
            Items.iron_pickaxe);

        // Tier 4 pickaxe
        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi_four, 1),
            "OEO",
            "DPD",
            "OEO",
            'P',
            new ItemStack(stoneyPickaxi_three, 1, 0),
            'D',
            Blocks.diamond_block,
            'O',
            Blocks.diamond_ore,
            'E',
            Blocks.emerald_block);

        // Tier 5 pickaxe
        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyPickaxi_five, 1),
            "OBO",
            "OPO",
            "OOO",
            'P',
            new ItemStack(stoneyPickaxi_four, 1, 0),
            'B',
            Items.nether_star,
            'O',
            Blocks.obsidian);

        /*
         * if this code isn't used , if the player don't use stoneyshovelaxi mod it will lead to crash
         * if (FMLCommonHandler.instance()
         * .findContainerFor("stoneyshovelaxi") != null) {
         * GameRegistry.addShapedRecipe(
         * new ItemStack(Blocks.log, 1),
         * "   ",
         * " G ",
         * " H ",
         * 'G',
         * new ItemStack(RegisterItems.stoneyShovelaxi, 1, 0),
         * 'H',
         * Items.flint);
         * }
         */
    }
}
