package com.gildedrose;

class GildedRose {
    Item[] items;
    ItemStrategyFactory itemStrategyFactory = new ItemStrategyFactory();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            itemStrategyFactory.getStrategy(items[i]).update(items[i]);
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