package vehicle;

public class FourWheeler implements AdvancedVehicle, EngineType{
	@Override
	public void vehicleFormat(String type) {
		System.out.println("Driving FourWheeler "+type);
	}
	
	@Override
	public void speed() {
		System.out.println("Max Speed : 120km/hr");
	}
}
