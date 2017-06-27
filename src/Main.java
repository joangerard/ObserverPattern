
public class Main {
	public static void main(String[] args){
		WeatherData wd = new WeatherData();
		System.out.println("Hola");
		DisplayElement currentDisplay = new CurrentConditionsDisplay(wd);
		wd.setMessurements(0.5f,0.6f,0.7f);
		wd.setMessurements(0.6f,0.7f,0.8f);
		wd.setMessurements(0.7f,0.8f,0.9f);
	}
}
