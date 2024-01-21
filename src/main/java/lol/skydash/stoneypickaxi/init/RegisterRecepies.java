package lol.skydash.stoneypickaxi.init;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneyingotaxi.init.RegisterItems;
import lol.skydash.stoneypickaxi.init.Recepies.Normal.*;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

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
        stoniePickaxieNormal_1.Recipes_Default_1();
        stoniePickaxieNormal_2.Recipes_Default_2();
        stoniePickaxieNormal_3.Recipes_Default_3();
        stoniePickaxieNormal_4.Recipes_Default_4();
        stoniePickaxieNormal_5.Recipes_Default_5();
        stoniePickaxieNormal_6.Recipes_Default_6();
        stoniePickaxieNormal_7.Recipes_Default_7();
        stoniePickaxieNormal_8.Recipes_Default_8();
        stoniePickaxieNormal_9.Recipes_Default_9();
        stoniePickaxieNormal_10.Recipes_Default_10();
        stoniePickaxieNormal_11.Recipes_Default_11();
        stoniePickaxieNormal_12.Recipes_Default_12();
        stoniePickaxieNormal_13.Recipes_Default_13();
        stoniePickaxieNormal_14.Recipes_Default_14();
        stoniePickaxieNormal_15.Recipes_Default_15();
        stoniePickaxieNormal_16.Recipes_Default_16();
        stoniePickaxieNormal_17.Recipes_Default_17();
        stoniePickaxieNormal_18.Recipes_Default_18();
        stoniePickaxieNormal_19.Recipes_Default_19();
        stoniePickaxieNormal_20.Recipes_Default_20();
        stoniePickaxieNormal_21.Recipes_Default_21();
        stoniePickaxieNormal_22.Recipes_Default_22();
        stoniePickaxieNormal_23.Recipes_Default_23();
        stoniePickaxieNormal_24.Recipes_Default_24();
        stoniePickaxieNormal_25.Recipes_Default_25();
        stoniePickaxieNormal_26.Recipes_Default_26();
        stoniePickaxieNormal_27.Recipes_Default_27();
        stoniePickaxieNormal_28.Recipes_Default_28();
        stoniePickaxieNormal_29.Recipes_Default_29();
        stoniePickaxieNormal_30.Recipes_Default_30();
        stoniePickaxieNormal_31.Recipes_Default_31();
        stoniePickaxieNormal_32.Recipes_Default_32();
        stoniePickaxieNormal_33.Recipes_Default_33();
        stoniePickaxieNormal_34.Recipes_Default_34();
        stoniePickaxieNormal_35.Recipes_Default_35();
        stoniePickaxieNormal_36.Recipes_Default_36();
        stoniePickaxieNormal_37.Recipes_Default_37();
        stoniePickaxieNormal_38.Recipes_Default_38();
        stoniePickaxieNormal_39.Recipes_Default_39();
        stoniePickaxieNormal_40.Recipes_Default_40();
        stoniePickaxieNormal_41.Recipes_Default_41();
        stoniePickaxieNormal_42.Recipes_Default_42();
        stoniePickaxieNormal_43.Recipes_Default_43();
        stoniePickaxieNormal_44.Recipes_Default_44();
        stoniePickaxieNormal_45.Recipes_Default_45();
        stoniePickaxieNormal_46.Recipes_Default_46();
        stoniePickaxieNormal_47.Recipes_Default_47();
        stoniePickaxieNormal_48.Recipes_Default_48();
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
