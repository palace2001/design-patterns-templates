package dp.iterator;

import dp.iterator.employee.Waitress;
import dp.iterator.menu.DinerMenu;
import dp.iterator.menu.MenuItem;
import dp.iterator.menu.PancakeHouseMenu;

public class Run {
    public static void main(String[] args) {
        MenuItem pancake1 = new MenuItem("Strawberry Pancake", "Pancake with strawberry",
                false, 2000);
        MenuItem pancake2 = new MenuItem("Blueberry Pancake", "Pancake with blueberry",
                false, 2500);
        MenuItem pancake3 = new MenuItem("Soft Pancake", "Original Pancake",
                false, 1500);
        MenuItem fishAndChips = new MenuItem("fishAndChips", "Fish and Chips",
                false, 2100);
        MenuItem friedChicken = new MenuItem("friedChicken", "Fried chicken",
                false, 2500);

        MenuItem[] menuItems1 = {pancake1, pancake2, pancake3};
        MenuItem[] menuItems2 = {fishAndChips, friedChicken};

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu(menuItems1);
        DinerMenu dinerMenu = new DinerMenu(menuItems2);

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
