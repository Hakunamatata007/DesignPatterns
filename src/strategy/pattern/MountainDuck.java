package strategy.pattern;

public class MountainDuck extends Duck {

	public MountainDuck(IFlyBehavior flyB) {
		super(flyB);
	}

	// every type of duck has its own display behaviour which will be very specific to individual duck
	@Override
	public void display() {
		System.out.println("I am mountain duck");
	}
}
