package strategy.pattern;

public abstract class Duck {

	IFlyBehavior flyBehavior;

	public Duck(IFlyBehavior flyB) {
		this.flyBehavior = flyB;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public abstract void display();
}
