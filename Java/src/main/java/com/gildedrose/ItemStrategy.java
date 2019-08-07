package com.gildedrose;

public abstract class ItemStrategy {
	protected abstract void updateQuality(Item item);

	protected abstract void updateQualityAfterExpiry(Item item);

	public final void update(Item item) {
		updateQuality(item);
		
		ageOneDay(item);

		if (isPastExpiry(item)) {
			updateQualityAfterExpiry(item);
		}
	}

	protected void ageOneDay(Item item) {
		item.sellIn--;
	}

	protected boolean isPastExpiry(Item item) {
		return item.sellIn < 0;
	}

	protected void decreaseQuality(Item item) {
		if (0 < item.quality) {
			item.quality--;
		}
	}

	protected void increaseQuality(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}
}
