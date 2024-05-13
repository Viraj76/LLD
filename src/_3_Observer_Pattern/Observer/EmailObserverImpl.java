package _3_Observer_Pattern.Observer;

import _3_Observer_Pattern.Observable.StocksObservable;

public class EmailObserverImpl implements NotificationObserver{
    String emailId;
    StocksObservable stocksObservable;
    public EmailObserverImpl(String emailId, StocksObservable stocksObservable){
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        sendMail(emailId,"Product is available ace it right now");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to "+emailId);
    }
}
