package observer.pattern;

public class MobileDisplay implements Observer, DisplayElement {

	private float temp, humidity, pressure;
	private Subject weatherData;

	public MobileDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.register(this);
	}

	@Override
	public void display() {
		System.out.println("humidity = " + humidity + " temp = " + temp + " pressure =  " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		display();
	}

}
