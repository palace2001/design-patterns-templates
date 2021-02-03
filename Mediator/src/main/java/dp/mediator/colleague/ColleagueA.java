package dp.mediator.colleague;

import dp.mediator.md.Mediator;

public class ColleagueA extends Colleague{
    private String name = "COL-A";

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String event) {
        mediator.send(name, event);
    }

    @Override
    public void receive(String name, String event) {
        System.out.println("Receive " + event + " (" + name + ")");
    }

    @Override
    public String getString() {
        return name;
    }
}
