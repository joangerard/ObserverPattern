import java.util.Observable;
import java.util.Observer;


public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private float pression;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable arg0, Object arg1) {
		if(arg0 instanceof WeatherData){
			WeatherData wd = (WeatherData)arg0;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			this.pression = wd.getPression();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current Conditions: ");
		System.out.println("TEMPERATURE: "+this.temperature);
		System.out.println("HUMIDITY: "+this.humidity);
		System.out.println("PRESSION: "+this.pression);
	}
}
