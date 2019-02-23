package com.gildedrose;

public class ItemStrategyFactory {
    static AgedBrieStrategy agedBrieStrategy = new AgedBrieStrategy();
    static BackstagePassStrategy backstagePassStrategy = new BackstagePassStrategy();
    static DefaultItemStrategy defaultItemStrategy = new DefaultItemStrategy();
    static SulfurasHandsStrategy sulfurasHandsStrategy = new SulfurasHandsStrategy();


    public ItemStrategy getStrategy(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return sulfurasHandsStrategy;
        } else if (item.name.equals("Aged Brie")) {
            return agedBrieStrategy;
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return backstagePassStrategy;
        } else {
            return defaultItemStrategy;
        }
    }
}
