package observerpattern.withobserverpattern.observer;

import observerpattern.withobserverpattern.observable.StocksObservable;

public class EmailAlertobserver implements NotificationAlertObserver {

		String emailId;
		StocksObservable sobj;
		
		public EmailAlertobserver(String emailId, StocksObservable obj) {
		
			this.sobj =obj;
			this.emailId=emailId;
		
	}

		@Override
		public void update() {
			sendMail(emailId ,  "Product is in stock hurry up");
		}

		private void sendMail(String emailId2, String msg) {
			
			System.out.println("mail sent to: " + emailId2);
			
		}
}
