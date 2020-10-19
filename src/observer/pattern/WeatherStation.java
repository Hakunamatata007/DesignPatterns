package observer.pattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		MobileDisplay mobile = new MobileDisplay(weatherData);
		weatherData.setMeasurment(12, 12, 12);
	}

}
