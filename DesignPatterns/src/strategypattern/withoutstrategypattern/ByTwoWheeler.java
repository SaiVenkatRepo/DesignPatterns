package strategypattern.withoutstrategypattern;

import java.util.ArrayList;
import java.util.List;

public class ByTwoWheeler extends NavigationApp {
	
	public ByTwoWheeler(String Start, String end) {
		// TODO Auto-generated constructor stub
		super(Start, end);
		
	}

	@Override
	public List<String> CalculateRoute() {
		List<String> route = new ArrayList<>();
        route.add("Start at " + start);
        route.add("Take the main road");
        route.add("Turn left ");
        route.add("Follow the service road for 10 miles");
        route.add("Take exit ");
        route.add("Arrive at " + end);
        return route;
	}

	@Override
	public int getEstimatedTime() {
		// TODO Auto-generated method stub
		return 40;
	}
	
	

}
