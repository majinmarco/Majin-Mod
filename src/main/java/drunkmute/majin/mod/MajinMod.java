package drunkmute.majin.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MajinMod implements ModInitializer {

	public static final Item MAJIN_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block MAJIN_BLOCK = new Block(FabricBlockSettings.of(Material.DENSE_ICE).strength(5.0F, 5.0F)
			.sounds(BlockSoundGroup.HONEY).breakByTool(FabricToolTags.PICKAXES));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("majinmod", "majin_item"), MAJIN_ITEM);
		Registry.register(Registry.BLOCK, new Identifier("majinmod", "majin_block"), MAJIN_BLOCK);
		Registry.register(Registry.ITEM, new Identifier("majinmod", "majin_block"),
				new BlockItem(MAJIN_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

	}
}
