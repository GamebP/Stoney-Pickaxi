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

    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL", 3, 2000, 6.0F, 0.1F, 30);

    public static void init() {
        // Kit tools
        stoneyPickaxi = new StoneyPickaxiPickaxe(STONEY_TOOLS_MATERIAL).setUnlocalizedName("Stoney Pickaxi")
            .setCreativeTab(StoneyPickaxi.StoneyPickaxeTab)
            .setTextureName(Reference.MOD_ID + ":stoneypickaxi");
    }

    // register items/blocks + make recipes
    public static void register() {
        // register names
        GameRegistry.registerItem(stoneyPickaxi, "stoneypickaxi");

        GameRegistry.addRecipe(
            new ItemStack(stoneyPickaxi, 1),
            "ALA",
            "CLC",
            " L ",
            /* Just a normal pickaxe recepie lol */
            'L',
            Items.stick,
            'A',
            Blocks.stone,
            'C',
            Blocks.cobblestone);
    }
}
