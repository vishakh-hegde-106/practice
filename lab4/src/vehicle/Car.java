package vehicle;

public class Car implements Vehicle,EngineType{
	@Override
	public void drive(String type) {
		System.out.println("Driving Car "+ type);
	}
	@Override
	public void speed() {
		System.out.println("Max Speed : 200km/hr");
	}
}
