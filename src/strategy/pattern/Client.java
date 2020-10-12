package strategy.pattern;

public class Client {

	public static void main(String[] args) {

		// mountain duck
		IFlyBehavior fly = new FlyBehavior();
		MountainDuck mountainDuck = new MountainDuck(fly);
		mountainDuck.performFly();
		mountainDuck.display();

		// rubber duck
		IFlyBehavior noFly = new NoFlyBehavior();
		RubberDuck rubberDuck = new RubberDuck(noFly);
		rubberDuck.performFly();
		rubberDuck.display();
	}

}
