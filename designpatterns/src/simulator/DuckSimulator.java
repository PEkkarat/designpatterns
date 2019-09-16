package simulator;

import duckfactory.AbstractDuckFactory;
import duckfactory.CountingDuckFactory;
import duckfactory.Flock;
import ducks.MallardDuck;
import goose.Goose;
import goose.GooseAdapter;
import pigeon.Pigeon;
import pigeon.PigeonAdapter;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        CountingDuckFactory duckFactory1= new CountingDuckFactory();

        Quackable mallardDuck = duckFactory1.createMallardDuck();
        Quackable redheadDuck = duckFactory1.createRedheadDuck();
        Quackable duckCall = duckFactory1.createDuckCall();
        Quackable rubberDuck = duckFactory1.createRubberDuck();

        // adapter
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        // decorator
        Quackable mallardEcho = new QuackCounter(new QuackEcho(new MallardDuck()));

        Flock flock = new Flock();
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);
        flock.add(gooseDuck);
        simulate(flock);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }



    void simulate(Quackable duck) {
        duck.quack();

    }


}
