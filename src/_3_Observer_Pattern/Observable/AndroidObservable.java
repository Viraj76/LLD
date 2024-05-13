package _3_Observer_Pattern.Observable;

import _3_Observer_Pattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservable implements StocksObservable{
    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    int stockCount = 0;
    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationObserver observer : notificationObserverList){
            observer.update();
        }
    }

    public void setStocksCount(int newStockAdded) {
        if(stockCount == 0){
                notifySubscriber();
        }
        stockCount += newStockAdded;
    }
    public int getStocksCount() {
        return stockCount;
    }
}
