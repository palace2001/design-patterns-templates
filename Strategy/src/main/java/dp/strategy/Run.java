package dp.strategy;

import dp.strategy.duck.Duck;
import dp.strategy.duck.MallardDuck;

public class Run {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
