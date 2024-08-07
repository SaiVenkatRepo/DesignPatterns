package strategypattern.withstrategypattern;

class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String start, String end) {
        System.out.println("Calculating public transport route from " + start + " to " + end);
        // Logic for calculating public transport route
    }
}

