package strategypattern.withoutstrategypattern;

import java.util.ArrayList;
import java.util.List;

public class ByWalking extends NavigationApp{

	public ByWalking(String start, String end) {
		super(start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> CalculateRoute() {
		List<String> route = new ArrayList<>();
        route.add("Start at " + start);
        route.add("Walk down Main Street");
        route.add("Turn left at the park");
        route.add("Cross the pedestrian bridge");
        route.add("Walk through the shopping district");
        route.add("Arrive at " + end);
        return route;
	}

	@Override
	public int getEstimatedTime() {
		// TODO Auto-generated method stub
		return 60;
	}

}
