package quack;

public class QuackEcho implements Quackable{
    Quackable duck;
    static int numberOfQuack;
    public QuackEcho (Quackable duck){
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        System.out.println("Echo : ");
        duck.quack();
    }

}
