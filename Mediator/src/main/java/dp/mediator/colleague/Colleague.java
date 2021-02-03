package dp.mediator.colleague;

import dp.mediator.md.Mediator;

public abstract class Colleague {
    public Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String name, String event) {
        mediator.send(name, event);
    }

    abstract public void send(String event);

    abstract public void receive(String name, String event);

    abstract public String getString();
}
