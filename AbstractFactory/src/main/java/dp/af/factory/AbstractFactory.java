package dp.af.factory;

import dp.af.product.AbstractProductA;
import dp.af.product.AbstractProductB;

public interface AbstractFactory {
    public AbstractProductA getProductA();
    public AbstractProductB getProductB();
}
