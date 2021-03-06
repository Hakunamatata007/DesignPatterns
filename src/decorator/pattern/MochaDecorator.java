package decorator.pattern;

public class MochaDecorator extends CondimentDecorator {

	Beverage beverage;

	public MochaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Mocha";
	}

	@Override
	public double cost() {
		return beverage.cost() + .20;
	}

}
