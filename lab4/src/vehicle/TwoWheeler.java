package vehicle;

public class TwoWheeler implements AdvancedVehicle,EngineType{
	@Override
	public void vehicleFormat(String type) {
		System.out.println("Driving Two Wheeler "+type);
	}
	@Override
	public void speed() {
		System.out.println("Max Speed : 150km/hr");
	}
}
