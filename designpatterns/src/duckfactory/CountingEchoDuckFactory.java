package duckfactory;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import quack.QuackCounter;
import quack.QuackEcho;
import quack.Quackable;

public class CountingEchoDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));}
}
