package decoratorpattern.withdecoratorpattern;

public class OrderPizza {

	public static void main(String[] args) {
		
		BasePizza pizza= new VegDelight();		
		System.out.println("Cost of the Pizza: " + pizza.cost());
		

		BasePizza pizza1= new ExtraCheese(new VegDelight());		
		System.out.println("Cost of the Pizza with ExtraCheese: " + pizza1.cost());
		
		
		BasePizza pizza2= new Mushroom(new ExtraCheese(new VegDelight()));		
		System.out.println("Cost of the Pizza with ExtraCheese plus mushroom toppings : " + pizza2.cost());
	}

}
