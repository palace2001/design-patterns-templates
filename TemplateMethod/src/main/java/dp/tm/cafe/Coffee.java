package dp.tm.cafe;

public class Coffee extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    private String getUserInput() {
        return "y"; // y or n
    }

    // Using hook.
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }
}
