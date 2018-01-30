package com.testing.atul.fragtest.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample name for user interfaces created by
 * Android template wizards.
 * <p>
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<Integer, DummyItem> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 4;
    static String[] names = new String[] {"Fire","Water","Earth","Wind"};
    static String[] details = new String[] {"Fire is hot","Water is cool","Earth is mild","Wind is fast"};

    static {
        // Add some sample items.
        for (int i = 0; i < COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(position, names[position], details[position]);
    }

    /**
     * A dummy item representing a piece of name.
     */
    public static class DummyItem {
        public final int id;
        public final String name;
        public final String details;

        public DummyItem(int id, String name, String details) {
            this.id = id;
            this.name = name;
            this.details = details;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
