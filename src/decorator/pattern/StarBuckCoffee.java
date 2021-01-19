package decorator.pattern;

public class StarBuckCoffee {

	public static void main(String[] args) {

		Beverage darkRoast = new DarkRoast();
		// no condiments has been added
		System.out.println(darkRoast.getDescription());
		System.out.println(darkRoast.cost());

		// lets add some condiments
		darkRoast = new MochaDecorator(darkRoast);
		// since mochaDecorator is a CondimentDecorator and Condiment decorator is a
		// Beverage
		// hence we can override the default behaviour of darkRoast by providing
		// additional behaviour to the existing behaviour
		System.out.println(darkRoast.getDescription());
		System.out.println(darkRoast.cost());
		// adding whip also
		darkRoast = new WhipDecorator(darkRoast);
		System.out.println(darkRoast.getDescription());
		System.out.println(darkRoast.cost());
	}

}
