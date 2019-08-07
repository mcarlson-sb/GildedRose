package com.gildedrose;

public class AgedBrieStrategy extends ItemStrategy{

	@Override
	protected void updateQualityAfterExpiry(Item item) {
		increaseQuality(item);
	}

	@Override
	protected void updateQuality(Item item) {
		increaseQuality(item);
	}
}
