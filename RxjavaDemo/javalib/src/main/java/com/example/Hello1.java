package com.example;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by xubt on 2016/4/5.
 */
public class Hello1 {
    static Observable<String> myObservable = Observable.create(new Observable.OnSubscribe<String>() {
        @Override
        public void call(Subscriber<? super String> subscriber) {
            subscriber.onNext("Hello1 World");
            subscriber.onCompleted();
        }
    });

   static  Subscriber<String> mySubscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {
            System.out.print("onCompleted---->");

        }

        @Override
        public void onError(Throwable e) {
            System.out.print("onError---->");
        }

        @Override
        public void onNext(String s) {
            System.out.print(s);
        }
    };

    public static void main(String[] args) {
//        myObservable.subscribe(mySubscriber);


        //使用java8的lambda可以使代码更简洁
        Observable.just("hello world")
                .subscribe(s -> System.out.print(s));
    }
}
