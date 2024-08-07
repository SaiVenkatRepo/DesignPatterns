package factorypattern.withfactorypattern;


public class ClientSelection {
	
	private	Vehicle veh;
	
	ClientSelection(VehicleFactory vehf)
	{
		veh = vehf.createVehicle();
	}
	
	public Vehicle getVehicle() {
		
		return veh;		
	}
}
