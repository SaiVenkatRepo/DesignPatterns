package abstractfactorypattern.withabstractfactorypattern;

public class NorthAmericaCarFactory implements CarFactory{

	@Override
	public CarModel model() {
		return new Sedan();
	}

	@Override
	public CarSpecification carSpecificationdisplay() {
		return new NorthAmericaSpecification();
	}

}
