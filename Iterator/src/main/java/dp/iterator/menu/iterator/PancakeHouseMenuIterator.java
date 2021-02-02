package dp.iterator.menu.iterator;

import dp.iterator.menu.MenuItem;

import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public PancakeHouseMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
