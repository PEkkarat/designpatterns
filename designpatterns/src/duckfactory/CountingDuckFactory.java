package duckfactory;

import duckfactory.AbstractDuckFactory;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.Quackable;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
