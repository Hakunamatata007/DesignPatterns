package strategy.pattern;

public class RubberDuck extends Duck {

	public RubberDuck(IFlyBehavior flyB) {
		super(flyB);
	}

	@Override
	public void display() {
		System.out.println("I am rubber duck");
	}

}
