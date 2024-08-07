package decoratorpattern.withdecoratorpattern;

public class Mushroom extends BasePizza{
	
	BasePizza basePizza;
	
	public Mushroom(BasePizza pizza) {
		this.basePizza =pizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost() + 80;
	}
}
