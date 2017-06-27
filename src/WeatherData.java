import java.util.Observable;


public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pression;
	
	private void messurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMessurements(float temperature,float humidity, float pression) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pression = pression;
		messurementsChanged();
	}
	
	public float getTemperature(){
		return this.temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPression() {
		return pression;
	}

}
