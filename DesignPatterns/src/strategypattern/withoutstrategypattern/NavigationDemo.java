package strategypattern.withoutstrategypattern;

public class NavigationDemo {

	
		 public static void main(String[] args) {
		        System.out.println("=== Four wheeler Route ===");
		        NavigationApp fourWheeler = new ByFourWheeler("Home", "Office");
		        fourWheeler.printRoute();

		     /*   System.out.println("\n=== Walking Route ===");
		        NavigationApp walkingNav = new ByWalking("Home", "Park");
		        walkingNav.printRoute();
		        
		        System.out.println("\n=== Two wheeler Route ===");
		        NavigationApp twoWheeler = new ByTwoWheeler("Home", "Shopping Store");
		        twoWheeler.printRoute();

		        System.out.println("\n=== Public Transport Route ===");
		        NavigationApp publicTransportNav = new ByPublicTransport("Home", "Downtown");
		        publicTransportNav.printRoute();*/

	}

}
