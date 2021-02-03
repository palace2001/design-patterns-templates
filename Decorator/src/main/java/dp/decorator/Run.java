package dp.decorator;

import dp.decorator.beverage.Beverage;
import dp.decorator.beverage.Espresso;
import dp.decorator.deco.Mocha;
import dp.decorator.deco.Whip;

public class Run {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
    }
}
