package observerpattern.withobserverpattern.observable;

import java.util.ArrayList;
import java.util.List;

import observerpattern.withobserverpattern.observer.NotificationAlertObserver;

public class IphoneStocksObervable implements StocksObservable {

	List<NotificationAlertObserver> notifyMeList = new ArrayList<>();
	public int iphoneStockCount = 0;
	

	@Override
	public void add(NotificationAlertObserver obj) {
		notifyMeList.add(obj);
		
	}

	@Override
	public void remove(NotificationAlertObserver obj) {
		notifyMeList.remove(obj);
		
	}

	@Override
	public void notifyStocks() {
		for(NotificationAlertObserver observer : notifyMeList)
		{
			observer.update();
		}
	}

	@Override
	public void setStocks(int newIphoneStock) {
		
		

		if(newIphoneStock !=0 && iphoneStockCount ==0)
		{
			notifyStocks();
		}
		iphoneStockCount = iphoneStockCount + newIphoneStock;

	}

	
}
