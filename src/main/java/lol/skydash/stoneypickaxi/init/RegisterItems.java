package lol.skydash.stoneypickaxi.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneypickaxi.StoneyPickaxi;
import lol.skydash.stoneypickaxi.tools.StoneyPickaxiPickaxe;
import lol.skydash.stoneypickaxi.utils.Reference;

public class RegisterItems {

    // items
    public static Item stoneyPickaxi;
    public static Item stoneyPickaxi_one;
    public static Item stoneyPickaxi_two;
    public static Item stoneyPickaxi_three;
    public static Item stoneyPickaxi_four;
    public static Item stoneyPickaxi_five;

    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL", 2, 659, 4.0F, 3.0F, 30);
    // Tear 1
    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL_ONE = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL_ONE", 2, 679, 3.8F, 2.8F, 30);
    // Tear 2
    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL_TWO = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL_TWO", 2, 699, 3.6F, 2.6F, 30);
    // Tear 3
    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL_THREE = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL_THREE", 2, 749, 3.5F, 2.5F, 30);
    // Tear 4
    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL_FOUR = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL_FOUR", 2, 859, 3.5F, 2.5F, 30);
    // Tear 5
    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL_FIVE = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL_FOUR", 3, 1099, 5F, 4F, 30);

    public static void init() {
        // Kit tools
        // Normal pickaxe
        stoneyPickaxi = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL)
            .setUnlocalizedName("stoneypickaxi")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi");
        // Tier 1
        stoneyPickaxi_one = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_ONE)
            .setUnlocalizedName("stoneypickaxi_one")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi_one");
        // Tear 2
        stoneyPickaxi_two = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL_TWO)
            .setUnlocalizedName("stoneypickaxi_two")
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

    // register items/blocks + make recipes
    public static void register() {
        // register names
        // Normal pickaxe
        GameRegistry.registerItem(stoneyPickaxi, "stoneypickaxi");

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
            'P', new ItemStack(stoneyPickaxi_four, 1, 0),
            'B', Items.nether_star,
            'O', Blocks.obsidian);
    }
}
