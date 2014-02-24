package version5;

public class RubberDuck implements Duck, QuackOnlyGroup {

    private FlyStrategy flyBehavior;
    private QuackStrategy quackBehavior;

    public RubberDuck(FlyStrategy fb, QuackStrategy qb) {
            this.quackBehavior = qb; 
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

    @Override
    public void swim() {
        System.out.println("Splish splash, I am taking a bath");
    }

    @Override
    public void performQuack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FlyStrategy getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyStrategy flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackStrategy getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackStrategy quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    
}
