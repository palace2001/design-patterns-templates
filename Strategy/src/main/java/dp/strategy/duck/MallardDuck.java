package dp.strategy.duck;

import dp.strategy.fly.FlyWithWings;
import dp.strategy.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard Duck");
    }
}
