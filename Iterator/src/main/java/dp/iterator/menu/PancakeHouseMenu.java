package dp.iterator.menu;

import dp.iterator.menu.iterator.DinerMenuIterator;

import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    private MenuItem[] menuItems;

    public PancakeHouseMenu(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
