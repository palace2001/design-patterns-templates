package dp.af.factory;

import dp.af.product.AbstractProductA;
import dp.af.product.AbstractProductB;
import dp.af.product.ProductA2;
import dp.af.product.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA getProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB getProductB() {
        return new ProductB2();
    }
}
