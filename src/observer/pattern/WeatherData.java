package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temp, humidity, pressure;

	// getState()
	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.removeIf(obs -> obs == observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure); // all data will be passed 
			observer.update(); // responsibility of observer to fetch the required data.
		}
	}

	public void measurmentChanged() {
		notifyObserver();
	}

	// setState()
	public void setMeasurment(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temp = temp;
		this.pressure = pressure;
		measurmentChanged();
	}

}
