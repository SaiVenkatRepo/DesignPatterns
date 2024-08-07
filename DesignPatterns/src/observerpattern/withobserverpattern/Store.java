package observerpattern.withobserverpattern;

import observerpattern.withobserverpattern.observable.IphoneStocksObervable;
import observerpattern.withobserverpattern.observable.StocksObservable;
import observerpattern.withobserverpattern.observer.EmailAlertobserver;
import observerpattern.withobserverpattern.observer.NotificationAlertObserver;

public class Store {

	public static void main(String[] args) {

		StocksObservable iphoneStocks = new IphoneStocksObervable();

		NotificationAlertObserver observer1 = new EmailAlertobserver("xyz@gmail.com", iphoneStocks);
		NotificationAlertObserver observer2 = new EmailAlertobserver("abc@gmail.com", iphoneStocks);

		iphoneStocks.add(observer1);
		iphoneStocks.add(observer2);

		iphoneStocks.setStocks(10);

	}

}
