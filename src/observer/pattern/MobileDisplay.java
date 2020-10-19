package observer.pattern;

// concrete observer
public class MobileDisplay implements Observer, DisplayElement {

	private float temp, humidity, pressure;
	private WeatherData weatherData;

	public MobileDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}

	@Override
	public void display() {
		System.out.println("humidity = " + humidity + " temp = " + temp + " pressure =  " + pressure);
	}

	@Override
	public void update() {
		humidity = weatherData.getHumidity();
		temp = weatherData.getTemp();
		pressure = weatherData.getPressure();
		System.out.println("without args");
		display();
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		System.out.println("with args");
		display();
	}
}