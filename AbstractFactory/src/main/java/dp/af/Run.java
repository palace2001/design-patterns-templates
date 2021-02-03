package dp.af;

import dp.af.factory.AbstractFactory;
import dp.af.factory.ConcreteFactory1;
import dp.af.factory.ConcreteFactory2;

public class Run {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        factory1.getProductA().process();
        factory1.getProductB().process();

        AbstractFactory factory2 = new ConcreteFactory2();
        factory2.getProductA().process();
        factory2.getProductB().process();
    }
}
