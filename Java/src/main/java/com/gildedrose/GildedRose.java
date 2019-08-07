package com.gildedrose;

class GildedRose {
	Item[] items;
	ItemStrategyFactory itemStrategyFactory = new ItemStrategyFactory();

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			itemStrategyFactory.getStrategy(item).update(item);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int index = 0; index < items.length; index++) {
			sb.append("[" + items[index].name + ", " + items[index].sellIn + ", " + items[index].quality + "]");
		}
		return sb.toString();
	}
}