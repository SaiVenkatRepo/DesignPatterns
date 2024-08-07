package strategypattern.withstrategypattern;

//Concrete strategies
class DrivingStrategy implements RouteStrategy {
 @Override
 public void calculateRoute(String start, String end) {
     System.out.println("Calculating driving route from " + start + " to " + end);
     // Logic for calculating driving route
 }
}
