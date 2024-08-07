package observerpattern.withobserverpattern.observable;

import observerpattern.withobserverpattern.observer.NotificationAlertObserver;

public interface StocksObservable {

	public void add(NotificationAlertObserver obj);
	public void remove( NotificationAlertObserver obj);
	public void notifyStocks();
	public void setStocks(int newIphoneStock);
}
