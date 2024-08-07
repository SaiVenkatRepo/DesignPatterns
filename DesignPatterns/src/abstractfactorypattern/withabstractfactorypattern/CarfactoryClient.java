package abstractfactorypattern.withabstractfactorypattern;

public class CarfactoryClient {
	
	public static void main(String args[]) {
		
		CarFactory northFactory = new NorthAmericaCarFactory();
		CarModel northModel = northFactory.model();
		CarSpecification northCarSpecification = northFactory.carSpecificationdisplay();
		
		northModel.model();
		northCarSpecification.carSpecificationdisplay();
	}

}
