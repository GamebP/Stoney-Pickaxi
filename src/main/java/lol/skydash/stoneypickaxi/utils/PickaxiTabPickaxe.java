package lol.skydash.stoneypickaxi.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class PickaxiTabPickaxe extends CreativeTabs {

    public PickaxiTabPickaxe(String label) {
        super(label);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Stoney Pickaxi";
    }

    @Override
    public Item getTabIconItem() {
        return Items.stone_pickaxe;
    }
}
