package com.gildedrose;

public class DefaultItemStrategy extends ItemStrategy {

	@Override
	protected void updateQuality(Item item) {
		decreaseQuality(item);
	}

	@Override
	protected void updateQualityAfterExpiry(Item item) {
		decreaseQuality(item);
	}
}
