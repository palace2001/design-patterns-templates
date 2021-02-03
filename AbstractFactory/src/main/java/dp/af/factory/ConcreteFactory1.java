package dp.af.factory;

import dp.af.product.AbstractProductA;
import dp.af.product.AbstractProductB;
import dp.af.product.ProductA1;
import dp.af.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB1();
    }
}
