package _3_Observer_Pattern;

import _3_Observer_Pattern.Observable.AndroidObservable;
import _3_Observer_Pattern.Observable.StocksObservable;
import _3_Observer_Pattern.Observer.EmailObserverImpl;
import _3_Observer_Pattern.Observer.MobilePhoneObserverImpl;
import _3_Observer_Pattern.Observer.NotificationObserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Store {
    public static void main(String[] args) throws IOException {
        AndroidObservable androidStockObservable = new AndroidObservable();

        NotificationObserver observer1 = new MobilePhoneObserverImpl("number1",androidStockObservable);
        NotificationObserver observer2 = new MobilePhoneObserverImpl("number2",androidStockObservable);
        NotificationObserver observer3 = new EmailObserverImpl("mail3",androidStockObservable);

        androidStockObservable.add(observer1);
        androidStockObservable.add(observer2);
        androidStockObservable.add(observer3);

        androidStockObservable.setStocksCount(10);
//        androidStockObservable.setStocksCount(0);
        androidStockObservable.setStocksCount(100);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        while(true){
//            System.out.println("\n");
//            System.out.println("Press 1 for adding stock");
//            System.out.println("Press 2 for adding new observers");
//            System.out.println("Press 3 for exit");
//
//            int chosen = Integer.parseInt(br.readLine());
//
//            switch (chosen) {
//                case 1 -> {
//                    System.out.println("Enter number of stock you adding");
//                    int stocks = Integer.parseInt(br.readLine());
//                    androidStockObservable.setStocksCount(stocks);
//                }
//                case 2 -> {
//                    System.out.println("Enter the notification type");
//                    String notiType = br.readLine();
//                    NotificationObserver observer = new MobilePhoneObserverImpl(notiType, androidStockObservable);
//                    androidStockObservable.add(observer);
//                }
//                case 3 -> System.exit(0);
//                default -> System.out.println("Wrong input");
//            }
//
//        }

    }
}
