package vehicle;

public class VehicleAdapter implements Vehicle,EngineType{
	private AdvancedVehicle advancedVehicle;
	public VehicleAdapter(AdvancedVehicle adv) {
		this.advancedVehicle = adv;
	}
	
	@Override
	public void drive(String type) {
		this.advancedVehicle.vehicleFormat(type);
	}
	@Override
	public void speed() {
		System.out.println("High Speed");
	}
	
}
