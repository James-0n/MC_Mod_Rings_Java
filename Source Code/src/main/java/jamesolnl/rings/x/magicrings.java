package jamesolnl.rings.x;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class magicrings implements ModInitializer {

	public static final Item DIAMOND_RING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item ONYX_RING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item EMERALD_RING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item RUBY_RING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item SAPPHIRE_RING = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item QUARTZ_RING = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM,new Identifier("ringsx","diamond_ring"), DIAMOND_RING);
		Registry.register(Registry.ITEM,new Identifier("ringsx","onyx_ring"), ONYX_RING);
		Registry.register(Registry.ITEM,new Identifier("ringsx","emerald_ring"), EMERALD_RING);
		Registry.register(Registry.ITEM,new Identifier("ringsx","ruby_ring"), RUBY_RING);
		Registry.register(Registry.ITEM,new Identifier("ringsx","sapphire_ring"), SAPPHIRE_RING);
		Registry.register(Registry.ITEM,new Identifier("ringsx","quartz_ring"), QUARTZ_RING);

	}
}
