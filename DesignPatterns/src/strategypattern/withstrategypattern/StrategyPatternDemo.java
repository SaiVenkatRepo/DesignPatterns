package strategypattern.withstrategypattern;

//Client code
public class StrategyPatternDemo {
 public static void main(String[] args) {
     NavigationApp nav = new NavigationApp();

     nav.setRouteStrategy(new DrivingStrategy());
     nav.calculateRoute("Home", "Office");

     nav.setRouteStrategy(new WalkingStrategy());
     nav.calculateRoute("Home", "Park");

     nav.setRouteStrategy(new PublicTransportStrategy());
     nav.calculateRoute("Home", "Downtown");
 }
}

