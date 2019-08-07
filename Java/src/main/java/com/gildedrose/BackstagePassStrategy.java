package com.gildedrose;

public class BackstagePassStrategy extends ItemStrategy {

	@Override
	protected void updateQuality(Item item) {
		increaseQuality(item);

		if (item.sellIn < 11) {
			increaseQuality(item);
		}

		if (item.sellIn < 6) {
			increaseQuality(item);
		}
	}

	@Override
	protected void updateQualityAfterExpiry(Item item) {
		if (item.sellIn < 0) {
			item.quality = 0;
		}
	}
}
