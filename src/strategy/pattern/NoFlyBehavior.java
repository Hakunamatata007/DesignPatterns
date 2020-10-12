package strategy.pattern;

public class NoFlyBehavior implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("Rubber Duck don't fly");
	}

}
