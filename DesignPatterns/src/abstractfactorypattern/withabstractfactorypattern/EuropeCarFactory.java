package abstractfactorypattern.withabstractfactorypattern;

public class EuropeCarFactory implements CarFactory {

	@Override
	public CarModel model() {
		return new HatchBack();
	}

	@Override
	public CarSpecification carSpecificationdisplay() {
		return new EuropeSpecification();
	}
	
	

}
