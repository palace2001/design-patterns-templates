package dp.mediator.md;

import dp.mediator.colleague.Colleague;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {
    private ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void send(String colleague, String event) {
        for (Colleague c : colleagues) {
            if (c.getString().equals(colleague)) {
                c.receive(colleague, event);
                return;
            }
        }
    }

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }
}
