package observer.pattern;

// This is the Observable Class
public interface Subject {

	public void register(Observer observer);

	public void remove(Observer observer);

	public void notifyObserver();

}
