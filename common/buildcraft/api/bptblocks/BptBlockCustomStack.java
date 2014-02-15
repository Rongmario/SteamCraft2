/** 
 * Copyright (c) SpaceToad, 2011
 * http://www.mod-buildcraft.com
 * 
 * BuildCraft is distributed under the terms of the Minecraft Mod Public 
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */

package common.buildcraft.api.bptblocks;

import java.util.LinkedList;

import common.buildcraft.api.blueprints.BptBlock;
import common.buildcraft.api.blueprints.BptSlotInfo;
import common.buildcraft.api.blueprints.IBptContext;

import net.minecraft.item.ItemStack;

@Deprecated
public class BptBlockCustomStack extends BptBlock {

	final ItemStack customStack;

	public BptBlockCustomStack(int blockId, ItemStack customStack) {
		super(blockId);

		this.customStack = customStack;
	}

	@Override
	public void addRequirements(BptSlotInfo slot, IBptContext context, LinkedList<ItemStack> requirements) {
		requirements.add(customStack.copy());
	}

}