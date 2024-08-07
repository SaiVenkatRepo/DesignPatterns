package strategypattern.withoutstrategypattern;

import java.util.List;

public abstract class NavigationApp {
	
	protected String start;
	protected String end;
	
	

	public NavigationApp(String start, String end) {
		
		this.start = start;
		this.end = end;
	}

	public abstract List<String> CalculateRoute();
	public abstract int getEstimatedTime();

	public void printRoute() {
		
		List <String> route = CalculateRoute();
		for(int i=0 ;i<route.size();i++)
			
			System.out.println(route.get(i));

	System.out.println("Estimated time :" + getEstimatedTime() + "minutes");
	}
	
}
