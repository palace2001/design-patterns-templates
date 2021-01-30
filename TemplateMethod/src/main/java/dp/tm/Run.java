package dp.tm;

import dp.tm.cafe.Coffee;
import dp.tm.cafe.Tea;

public class Run {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();
    }
}
