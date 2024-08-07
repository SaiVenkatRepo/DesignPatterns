package strategypattern.withstrategypattern;

// Context class
class NavigationApp {
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void calculateRoute(String start, String end) {
        if (routeStrategy == null) {
            throw new IllegalStateException("Route strategy not set");
        }
        routeStrategy.calculateRoute(start, end);
    }
}

