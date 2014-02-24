package version5;

public class ModelDuck implements Duck {

    private FlyStrategy flyBehavior;
    private QuackStrategy quackBehavior;

    public ModelDuck(FlyStrategy fb, QuackStrategy qb) {
        this.flyBehavior = fb;
        this.quackBehavior = qb;

    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

    @Override
    public void swim() {
        System.out.println("I am just floating around");
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
