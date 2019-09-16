package duckfactory;

import duckfactory.AbstractDuckFactory;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
