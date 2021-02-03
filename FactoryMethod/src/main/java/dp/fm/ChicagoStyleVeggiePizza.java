package dp.fm;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Deep Dish Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Veggie");
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
