package version5;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck(new FlyNoWay(), new MuteQuack());
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack();
        
        
//        mallard.performQuack();
//        mallard.performFly();
        
        
//		Duck model = new ModelDuck();
//		model.display();
//		model.performFly();
//		model.setFlyBehavior( new FlyRocketPowered() );
//		model.performFly();
    }

}
