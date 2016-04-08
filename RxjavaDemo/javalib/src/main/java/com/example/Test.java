package com.example;

import rx.Observable;
import rx.functions.Action1;

public class Test {


    public static void main(String[] args) {
        hello("xubt","xbting");
    }



    public static void hello(String ... names){
        Observable.from(names).subscribe(new Action1<String>() {

            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }

        });
    }
}
