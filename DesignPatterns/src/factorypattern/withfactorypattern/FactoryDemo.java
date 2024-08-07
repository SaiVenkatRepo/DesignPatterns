package factorypattern.withfactorypattern;

public class FactoryDemo {

	public static void main(String[] args) {

		VehicleFactory vehf = new TwoWheelerFactory();
		ClientSelection cveh = new ClientSelection(vehf);
		Vehicle veh = cveh.getVehicle();
		veh.printVehicle();
		
		VehicleFactory vehf1 = new FourWheelerFactory();
		ClientSelection cveh1 = new ClientSelection(vehf1);
		Vehicle veh1 = cveh1.getVehicle();
		veh1.printVehicle();
	}

}
