package observer.pattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		MobileDisplay mobileDisplay = new MobileDisplay(weatherData);
		weatherData.setMeasurment(12, 12, 12);

		// when you instantiate concrete observer (mobile display in this case), we pass
		// the concrete subject(weather data)
		// through the constructor, when you create an observer you pass the thing you
		// want to observe so, its kind of goes two ways
		// the observer is passed into Subject via the add() method, it is added as
		// somebody who is subscribing to the changes on the concrete
		// observable, and we take the concrete observable and pass into the concrete
		// observer upon construction of the concrete observer
		// The point to that is when we do that the concrete observer has a reference to
		// the concrete observable
		// that is observing and if it has that when we call update we don't have to
		// pass anything in the update method
		// we are just saying that you were interested in knowing when this things
		// change, you said register me as an observer
		// I want to able to know when that thing changes, if we are not passing
		// anything how we will know what has changed
	}

}
