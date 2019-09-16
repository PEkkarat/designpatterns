package ducks;

import quack.Quackable;

public class DuckCall implements Quackable {

    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
