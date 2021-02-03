package dp.mediator;

import dp.mediator.colleague.ColleagueA;
import dp.mediator.colleague.ColleagueB;
import dp.mediator.md.ConcreteMediator;

public class Run {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ColleagueA colleagueA = new ColleagueA(concreteMediator);
        ColleagueB colleagueB = new ColleagueB(concreteMediator);
        concreteMediator.addColleague(colleagueA);
        concreteMediator.addColleague(colleagueB);

        colleagueA.send("COL-B", "A -> B by mediator");
        colleagueA.send("COL-A", "B -> A by mediator");
    }
}
