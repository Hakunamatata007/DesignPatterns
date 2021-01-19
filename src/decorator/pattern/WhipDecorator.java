package decorator.pattern;

public class WhipDecorator extends CondimentDecorator {

	Beverage beverage;

	public WhipDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + " Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + .23;
	}

}
