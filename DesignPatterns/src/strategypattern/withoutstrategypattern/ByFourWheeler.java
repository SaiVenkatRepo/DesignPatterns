package strategypattern.withoutstrategypattern;

import java.util.ArrayList;
import java.util.List;

public class ByFourWheeler extends NavigationApp {

	public ByFourWheeler(String start, String end) {
		super(start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> CalculateRoute() {
		List<String> route = new ArrayList<>();
        route.add("Start at " + start);
        route.add("Take the main road");
        route.add("Turn right at the intersection");
        route.add("Follow the highway for 10 miles");
        route.add("Take exit 25");
        route.add("Arrive at " + end);
        return route;
	}

	@Override
	public int getEstimatedTime() {
		// TODO Auto-generated method stub
		return 30;
	}

}
