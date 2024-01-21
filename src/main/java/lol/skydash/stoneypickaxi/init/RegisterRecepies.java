package lol.skydash.stoneypickaxi.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneyingotaxi.init.RegisterItems;

public class RegisterRecepies extends RegisterVar {

    public static void Recepies() {
        // Items
        // stoneyIron
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(RegisterItems.stoneyIron, 1),
                "RRR",
                "RIR",
                "RRR",
                'I',
                new ItemStack(Items.iron_ingot, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0));
        }
        // stoneyDiamond
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(RegisterItems.stoneyDiamond, 1),
                "IPI",
                "RDR",
                "RPR",
                'D',
                new ItemStack(Items.diamond, 1, 0),
                'I',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0),
                'P',
                new ItemStack(stoneyPickaxi_seven, 1, 0));
        }

        // Pickaxes
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

        // Tier 6 pickaxe
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(stoneyPickaxi_six, 1),
                " B ",
                "OPO",
                " B ",
                'P',
                new ItemStack(stoneyPickaxi_five, 1, 0),
                'O',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'B',
                Items.nether_star);
        }

        // Tier 7 pickaxe
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(stoneyPickaxi_seven, 1),
                "BOB",
                "RPR",
                "BOB",
                'P',
                new ItemStack(stoneyPickaxi_six, 1, 0),
                'O',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0),
                'B',
                Items.nether_star);
        }

        // Tier 8 pickaxe
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(stoneyPickaxi_eight, 1),
                "DOB",
                "RPR",
                "BOD",
                'P',
                new ItemStack(stoneyPickaxi_seven, 1, 0),
                'O',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0),
                'D',
                new ItemStack(RegisterItems.stoneyDiamond, 1, 0),
                'B',
                Items.nether_star);
        }

        // Tier 9 pickaxe
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(stoneyPickaxi_nine, 1),
                "LOI",
                "RPD",
                "UBY",
                'P',
                new ItemStack(stoneyPickaxi_eight, 1, 0),
                'O',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0),
                'D',
                new ItemStack(RegisterItems.stoneyDiamond, 1, 0),
                'L',
                Items.record_11,
                'I',
                Items.record_strad,
                'U',
                Items.record_mellohi,
                'Y',
                Items.record_cat,
                'B',
                Items.nether_star);
        }

        // Tier 10 pickaxe
        if (FMLCommonHandler.instance()
            .findContainerFor("stoneyingotaxi") != null
            && FMLCommonHandler.instance()
                .findContainerFor("stoneyswordaxi") != null
            && FMLCommonHandler.instance()
                .findContainerFor("stoneyshovelaxi") != null) {
            GameRegistry.addShapedRecipe(
                new ItemStack(stoneyPickaxi_ten, 1),
                "HDS",
                "RPR",
                "IEI",
                'P',
                new ItemStack(stoneyPickaxi_ten, 1, 0),
                'I',
                new ItemStack(RegisterItems.stoneyIron, 1, 0),
                'R',
                new ItemStack(RegisterItems.stoneyRubbish, 1, 0),
                'D',
                new ItemStack(RegisterItems.stoneyDiamond, 1, 0),
                'H',
                new ItemStack(lol.skydash.stoneyshovelaxi.init.RegisterItems.stoneyShovelaxi, 1, 0),
                'S',
                new ItemStack(lol.skydash.stoneyswordaxi.init.RegisterItems.stoneySwordaxi, 1, 0),
                'E',
                Blocks.dragon_egg);
        }

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
