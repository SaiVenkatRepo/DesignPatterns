package strategypattern.withstrategypattern;

class WalkingStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Calculating walking route from " + start + " to " + end);
        // Logic for calculating walking route
    }
}