package org.virtue.game.logic.node.interfaces.impl;

import org.virtue.game.logic.World;
import org.virtue.game.logic.item.GroundItem;
import org.virtue.game.logic.item.Item;
import org.virtue.game.logic.node.entity.player.Player;
import org.virtue.game.logic.node.entity.player.container.EquipSlot;
import org.virtue.game.logic.node.entity.player.container.ItemsContainer;
import org.virtue.game.logic.node.entity.update.ref.Appearance.Gender;
import org.virtue.game.logic.node.interfaces.ActionButton;
import org.virtue.game.logic.node.interfaces.AbstractInterface;
import org.virtue.game.logic.node.interfaces.RS3Interface;
import org.virtue.game.logic.region.Tile;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * @author Taylor
 * @version 1.0
 */
public class Inventory extends AbstractInterface {
	
	public static final int INVENTORY_SIZE = 28;

	/**
	 * Represents the items in the inventory.
	 */
	private ItemsContainer<Item> items = new ItemsContainer<>(INVENTORY_SIZE, false);
	
	/**
	 * Constructs a new {@code inventory.java}.
	 * @param player The player.
	 */
	public Inventory(Player player) {
		super(RS3Interface.INVENTORY, player);
		//this.player = player;
		items.add(Item.create(54, 1));//Just for testing purposes; This can be updated with the actual items later
	}

	@Override
	public void postSend() {
		sendInterfaceSettings(8, -1, -1, 2097152);//IfaceSettings: 96534536, -1, -1, 2097152
		sendInterfaceSettings(8, 0, 27, 15302030);//IfaceSettings: 96534536, 27, 0, 15302030
		sendInterfaceSettings(0, 0, 27, 1536);//IfaceSettings: 96534528, 27, 0, 1536
	}
	
	/**
	 * Loads the interface settings.
	 */
	public void load() {
		getPlayer().getPacketDispatcher().dispatchItems(93, items);
//		player.getStack().sendWidgetSettings(INVENTORY_INTERFACE, 0, 0, 27, 4554126);
//		player.getStack().sendWidgetSettings(INVENTORY_INTERFACE, 0, 28, 55, 2097152);
	}
	
	/**
	 * Adds an item to the inventory.
	 * @param item The item to add.
	 * @param refresh Whether to refresh the inventory after adding the item.
	 * @return whether the item was successfully added
	 */
	public boolean add(Item item, boolean refresh) {
		boolean success = items.add(item);
		if (refresh) {
			refresh();
		}
		return success;
	}
	
	/**
	 * Adds an item to the inventory.
	 * @param item The item to add.
	 * @return whether the item was successfully added
	 */
	public boolean add(Item item) {
		boolean success = items.add(item);
		refresh();
		return success;
	}
	
	/**
	 * Removes an item from the inventory.
	 * @param slot The slot to remove from.
	 * @return The number of items removed
	 */
	public int remove(int slot) {
		int removed = items.remove(slot, items.get(slot));
		refresh(slot);
		return removed;
	}
	
	public int remove(Item item) {
		return remove(item, -1);
	}
	
	/**
	 * Removes an item.
	 * @param item The item to remove.
	 * @param slot The preferred slot to remove from
	 * @return The number of items removed
	 */
	public int remove(Item item, int slot) {
		int removed = 0;
		if (slot == -1) {
			removed = items.remove(item);
		} else {
			removed = items.remove(slot, item);
		}
		refresh();
		return removed;
	}
	
	/**
	 * Returns an item.
	 * @param id The id.
	 * @return The item.
	 */
	public Item getItem(int id) {
		for (Item item : items.toArray()) {
			if (item != null && item.getId() == id) {
				return item;
			} else {
				continue;
			}
		}
		return null;
	}
	
	public Item getItemAtSlot (int slotID) {
		return items.get(slotID);
	}
	
	public int getFreeSlots () {
		return items.freeSlots();
	}

	/**
	 * Returns a slot.
	 * @param id The id.
	 * @return The slot.
	 */
	public int getSlotForItem(int id) {
		for (int slot = 0; slot < items.getSize(); slot++) {
			if (items.get(slot).getId() == id) {
				return slot;
			} else {
				continue;
			}
		}
		return -1;
	}
	
	/**
	 * Refreshes this inventory.
	 * @param slots The ids of the slots to refresh (refreshes all slots if none are provided)
	 */
	public void refresh(int... slots) {
		getPlayer().getPacketDispatcher().dispatchItems(93, items, slots);
//		player.getStack().sendItemSet(93, items.toArray());
	}
	
	public void switchItem (int fromSlot, int toSlot) {
		switchItem(fromSlot, toSlot, true);
	}
	
	public void switchItem (int fromSlot, int toSlot, boolean refresh) {
		if (fromSlot == toSlot || fromSlot == -1 || toSlot == -1) {
			return;//No change took place
		}
		Item item = items.get(fromSlot);
		Item item2 = items.get(toSlot);
		items.set(fromSlot, item2);
		items.set(toSlot, item);
		if (refresh) {
			refresh(fromSlot, toSlot);
		}
	}

	/**
	 * Returns if this {@link Inventory} contains an item.
	 * @param id The item to check.
	 * @return True if so; false otherwise.
	 */
	public boolean contains(int id) {
		for (Item item : items.toArray()) {
			if (item == null)
				continue;
			if (item.getId() == id)
				return true;
			else
				continue;
		}
		return false;
	}
	
	/**
	 * Serialises the current inventory data into a {@link com.google.gson.JsonArray}
	 * @return	A JsonArray containing the inventory data
	 */
	public JsonArray serialise () {
		JsonArray inventory = new JsonArray();
		int slotID = 0;
		for (Item i : items.getItems()) {
			if (i == null) {
				slotID++;
				continue;
			}
			JsonObject item = new JsonObject();
			item.addProperty("slot", slotID);
			item.addProperty("item", i.getId());
			item.addProperty("amount", i.getAmount());
			inventory.add(item);
			slotID++;
		}
		return inventory;
	}
	
	/**
	 * Deserialises the inventory data from the specified JSON array
	 * @param inventory The {@link com.google.gson.JsonArray} containing the inventory data
	 */
	public void deserialise (JsonArray inventory) {
		items.reset();
		for (JsonElement itemData : inventory) {
			JsonObject data = (JsonObject) itemData;
			int slotID = data.get("slot").getAsInt();
			int itemID = data.get("item").getAsInt();
			int amount = data.get("amount").getAsInt();
			Item item = Item.create(itemID, amount);
			if (item.getDefinition() == null) {
				continue;//Item does not exist
			}
			items.set(slotID, item);
		}
	}
	
	/**
	 * @return The items
	 */
	public ItemsContainer<Item> getItems() {
		return items;
	}

	/**
	 * @param items The items to set
	 */
	public void setItems(ItemsContainer<Item> items) {
		this.items = items;
	}
	
	@Override
	public Item getItem (int component, int itemID, int slotID) {
		if (component == 8) {
			Item item = items.get(slotID);
			 if (item == null) {
                 return null;
             }
			 if (item.getId() != itemID) {
				 return null;
			 }
			 return item;
		}
		return null;
	}
	

	
	public void handleItemOnItem (int componentID, int itemIID1, int slot1, int itemID2, int slot2) {
		if (componentID == 8) {
			Item item = items.get(slot1);
			if (item.getId() != itemIID1) {
				return;//Item1 does not exist
			}
			Item item2 = items.get(slot2);
			if (item2.getId() != itemID2) {
				return;
			}
			item.handleItemOnItem(player, slot2, item2, slot2);
		}
	}

	@Override
	public void handleActionButton(int componentID, int slotID, int itemID, ActionButton button) {
            if (componentID == 8) {
                    Item item = items.get(slotID);
                    if (item == null) {
                        return;//Invalid item
                    }
                    int optionID = button.getID();
                    if (optionID > 3) {
                    	optionID -= 3;
                    }
                    String option = item.getDefinition().getOption(false, optionID);
					
                    if (button.equals(ActionButton.TWO) && item.getDefinition().isWearItem(
							getPlayer().getUpdateArchive().getAppearance().getGender() == Gender.MALE)) {
                        if (handleEquip(item, slotID, option)) {
                        	return;
                        }
                    } else if (button.equals(ActionButton.EIGHT)) {
                    	if (handleDrop(item, slotID, option)) {
                    		refresh(slotID);
                    		return;
                    	}
                    } else {
                    	item.handleInventoryOption(player, option, button, slotID);
                    	return;
                    }
                    System.out.println("Inventory item pressed: slot="+slotID+", itemID="+itemID+", option="+option+" ("+button.getID()+")");
                    return;
            }
            System.out.println("Inventory button pressed: component="+componentID+", slot="+slotID+", item="+itemID+", button="+button.getID());
	}
        
	public boolean handleEquip (Item item, int slotID, String option) {
		EquipSlot targetSlot = item.getEquipSlot();
		if (targetSlot == null) {
			return false;
		}
		//TODO: Further checks to make sure it's possible (level requirements, etc)
		Item oldItem = getPlayer().getEquipment().swapItem(targetSlot, item);
		//System.out.println("Swapping item "+oldItem.getDefinition().getName()+" with "+item.getDefinition().getName());
		items.set(slotID, oldItem);
		getPlayer().getUpdateArchive().getAppearance().packBlock();
		refresh(slotID);
		return true;
	}
	
	public boolean handleDrop (Item item, int slotID, String option) {
		if (option.equalsIgnoreCase("drop")) {
			GroundItem groundItem = new GroundItem(item.getId(), item.getAmount(), new Tile(getPlayer().getTile()));
			World.getWorld().getRegionManager().getRegionByID(getPlayer().getTile().getRegionID()).addItem(groundItem);
			items.remove(item);
			return true;
		} else if (option.equalsIgnoreCase("Destroy")) {
			
		}
		return false;
	}

	@Override
	public int getTabID() {		
		return 2;
	}
}
