package dp.iterator.employee;

import dp.iterator.menu.Menu;
import dp.iterator.menu.MenuItem;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("Menu\n----\nBREAKFAST");
        printIterator(pancakeIterator);
        System.out.println("\nLUNCH");
        printIterator(dinerIterator);
    }

    private void printIterator(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            // ..
        }
    }
}
