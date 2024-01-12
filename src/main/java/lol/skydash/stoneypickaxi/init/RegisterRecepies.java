package lol.skydash.stoneypickaxi.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

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
        GameRegistry.registerItem(stoneyPickaxi_one, "stoneypickaxi_one");

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
        GameRegistry.registerItem(stoneyPickaxi_two, "stoneypickaxi_two");

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
        GameRegistry.registerItem(stoneyPickaxi_three, "stoneypickaxi_three");

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
        GameRegistry.registerItem(stoneyPickaxi_four, "stoneypickaxi_four");

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
        GameRegistry.registerItem(stoneyPickaxi_five, "stoneypickaxi_five");

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

        GameRegistry.addShapedRecipe(
            new ItemStack(stoneyUnknown,1),
            "   ",
            " P ",
            "   ",
            'P',
            new ItemStack(stoneyDiamond,1,0)
        );
    }
}
