package com.example;

import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by xubt on 2016/4/5.
 */
public class Hello2 {
    public static void main(String[] args) {
        Observable<String> myObservable = Observable.just("hello word2");
        Action1<String> onNextAction = new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        };
        myObservable.subscribe(onNextAction);

        //简写版本
        Observable.just("hello")
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });


        //map操作符，用来把把一个事件转换为另一个事件的。
        Observable.just("hello")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + " xbting";
                    }
                })
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        System.out.println(s);
                    }
                });
        //subscriber并不关心返回的字符串，而是想要字符串的hash值
        Observable.just("hello")
                .map(new Func1<String, Integer>() {
                    @Override
                    public Integer call(String s) {
                        return s.hashCode();
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer s) {
                        System.out.println(s);
                    }
                });
    }

}
