package baubles.common.lib;

import baubles.common.Config;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class CreativeTabBaubles extends CreativeTabs {
    public CreativeTabBaubles(int par1, String par2Str) {
        super(par1, par2Str);
    }

    @SideOnly(Side.CLIENT)

    /**
     * the itemID for the item to be displayed on the tab
     */
    @Override
    public Item getTabIconItem() {
        return Config.itemRing;
    }

}
