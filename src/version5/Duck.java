package version5;

/**
 * The main difference with this 5th version is that the class
 * provides methods for setting fly and quack behaviors at runtime.
 * Otherwise, everything else is the same.
 * 
 * @author jlombardo
 *
 */
public interface Duck {
	// Instance variables of interface type
	// Each duck has a reference to something that implements the behaviors
	// via an interface. Hey, isn't this composition the DIP way!!!
	// Only problem is we still have the limitation that all Ducks
	// have fly and quack behaviors, even thought that is not always needed.
//	private FlyStrategy flyBehavior;
//	private QuackStrategy quackBehavior;
//	
//	public Duck() {}
//	
//	public void setFlyBehavior(FlyStrategy fb) {
// 		flyBehavior = fb;
//	}
//	
//	public void setQuackBehavior(QuackStrategy qb) {
//		quackBehavior = qb;
//	}
	
	public abstract void display();
	
	
//	public void performQuack(){
//		quackBehavior.quack();
//	}
//	
//	public void performFly() {
//		flyBehavior.fly();
//	}
	
	public abstract void swim();
	
	
	// OTHER DUCK-LIKE METHODS
}
