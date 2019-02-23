package com.gildedrose;

import static org.junit.Assert.*;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;
import org.approvaltests.Approvals;

public class GildedRoseTest {

    @Test
    public void testEverything() throws Exception {
        String[] items = { "Foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros" };
        Integer[] sellins = Range.get(-1, 100);
        Integer[] qualities = Range.get( -1, 100);
        CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
    }

    @Test
    public void testAgedBrie() throws Exception {
        String[] items = { "Aged Brie" };
        Integer[] sellins = Range.get(-1, 100);
        Integer[] qualities = Range.get( -1, 100);
        CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
    }

    @Test
    public void testBackStagePasses() throws Exception {
        String[] items = { "Backstage passes to a TAFKAL80ETC concert" };
        Integer[] sellins = Range.get(-1, 100);
        Integer[] qualities = Range.get( -1, 100);
        CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
    }

    @Test
    public void testSulfuraseHands() throws Exception {
        String[] items = { "Sulfuras, Hand of Ragnaros" };
        Integer[] sellins = Range.get(-1, 100);
        Integer[] qualities = Range.get( -1, 100);
        CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
    }

    @Test
    public void testRegularItem() throws Exception {
        String[] items = { "foo" };
        Integer[] sellins = Range.get(-1, 100);
        Integer[] qualities = Range.get( -1, 100);
        CombinationApprovals.verifyAllCombinations(this::checkItem, items, sellins, qualities);
    }
    
    public GildedRose checkItem(String item, Integer sellin, Integer quality) {
        Item[] items = new Item[] { new Item(item, sellin, quality) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app;
    }


}
