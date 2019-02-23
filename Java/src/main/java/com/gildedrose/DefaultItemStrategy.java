package com.gildedrose;

public class DefaultItemStrategy extends ItemStrategy {
    public void update(Item item) {
        if (0 < item.quality) {
            item.quality = item.quality - 1;
        }
        item.sellIn = item.sellIn - 1;

        if (item.sellIn < 0) {
            if (0 < item.quality) {
                item.quality = item.quality - 1;
            }
        }
    }
}
