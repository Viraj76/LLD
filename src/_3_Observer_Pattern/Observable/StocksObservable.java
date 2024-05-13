package _3_Observer_Pattern.Observable;

import _3_Observer_Pattern.Observer.NotificationObserver;

public interface StocksObservable {
    void add(NotificationObserver notificationObserver);
    void remove(NotificationObserver notificationObserver);
    void notifySubscriber();
    void setStocksCount(int newStockAdded);
    int getStocksCount();
}
