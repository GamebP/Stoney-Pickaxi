package lol.skydash.stoneypickaxi.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PickaxiTabItem extends CreativeTabs {

    public PickaxiTabItem(String label) {
        super(label);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Stoney Pickaxi Items";
    }

    @Override
    public Item getTabIconItem() {
        return (Item) Item.itemRegistry.getObject(Reference.MOD_ID + ":stoneyUnknown");
    }
}
