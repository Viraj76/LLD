package _3_Observer_Pattern.Observer;

import _3_Observer_Pattern.Observable.AndroidObservable;
import _3_Observer_Pattern.Observable.StocksObservable;

public class MobilePhoneObserverImpl implements NotificationObserver{
    String phoneNumber;
    StocksObservable stocksObservable;
    public MobilePhoneObserverImpl(String phoneNumber, StocksObservable stocksObservable){
        this.phoneNumber = phoneNumber;
        this.stocksObservable = stocksObservable;
    }
    @Override
    public void update() {
        sendMessages(phoneNumber,"Product is available now");
    }

    private void sendMessages(String phoneNumber,String msg) {
        System.out.println("Msg sent to "+ phoneNumber);
    }

}
