package strategypattern.withoutstrategypattern;

import java.util.ArrayList;
import java.util.List;

public class ByPublicTransport extends NavigationApp{

	public ByPublicTransport(String start, String end) {
		super(start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> CalculateRoute() {
		List<String> route = new ArrayList<>();
        route.add("Start at " + start);
        route.add("Walk to the nearest bus stop");
        route.add("Take bus number 42 for 5 stops");
        route.add("Transfer to the subway at Central Station");
        route.add("Take the Blue Line for 3 stops");
        route.add("Exit the subway and walk 2 blocks");
        route.add("Arrive at " + end);
        return route;
	}

	@Override
	public int getEstimatedTime() {
		// TODO Auto-generated method stub
		return 50;
	}

}
