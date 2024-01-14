package lol.skydash.stoneypickaxi.init;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class RegisterVar {

    // Pickaxes
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

}
