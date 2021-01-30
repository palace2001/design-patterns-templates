package dp.tm.cafe;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup () {
        System.out.println("Pouring into cup");
    }

    /*
        Hook : Control the algorithm by overriding as necessary.
        If you override it in a subclass and set it to false, it will behave differently.
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
