package appeng.container.interfaces;

import appeng.api.implementations.guiobjects.IPortableCell;
import net.minecraft.nbt.NBTTagCompound;

public interface IPortableTerminal extends IPortableCell, IInventorySlotAware {
	void saveChanges(NBTTagCompound data);
}
