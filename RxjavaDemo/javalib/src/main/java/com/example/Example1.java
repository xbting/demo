package com.example;

import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

/**
 * Created by xubt on 2016/4/5.
 */
public class Example1 {
    public static void main(String[] args) {
//        printer1();
//        printer2();
//        printer3();
//        printer4();
//        printer5();
        printer6();
    }

    /**
     * 打印查询结果，
     * 很差的写法，不提倡
     */
    static void printer1() {
        query().subscribe(new Action1<List<String>>() {
            @Override
            public void call(List<String> urls) {
                //
                for (String url : urls) {
                    System.out.println(url);
                }
            }
        });
    }

    /**
     * 打印结果
     * 稍微好点，还可以优化
     */
    static void printer2() {
        query()
                .subscribe(new Action1<List<String>>() {
                    @Override
                    public void call(List<String> urls) {
                        Observable.from(urls).subscribe(printerSubscriber);
                    }
                });
    }

    /**
     * 打印结果
     * flatMap操作符用法1
     * 比较好的，提倡这种写法
     */
    static void printer3() {
        query()
                .flatMap(new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(List<String> urls) {
                        return Observable.from(urls);
                    }
                }).subscribe(printerSubscriber);
    }

    /**
     * 打印处理过的结果
     *
     *  flatMap操作符用法2
     *
     */
    static void printer4() {
        query()
                .flatMap(new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(List<String> strings) {
                        return Observable.from(strings);
                    }
                })
                .flatMap(new Func1<String, Observable<String>>() {
                    @Override
                    public Observable<String> call(String s) {
                        return getTitle(s);
                    }
                }).subscribe(printerSubscriber);
    }

    /**
     * 打印结果
     * 打印前过滤掉某些条件的结果
     * filter操作符用法
     * token操作符用法  -指定输出结果数目
     */
    static void printer5() {
        query()
                .flatMap(new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(List<String> strings) {
                        return Observable.from(strings);
                    }
                })
                .flatMap(new Func1<String, Observable<String>>() {
                    @Override
                    public Observable<String> call(String s) {
                        return getTitle(s);
                    }
                })
                .filter(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String s) {
                        //过滤掉指定条件数据
                        return s != null;
                    }
                })
                .take(3)//指定输出结果数量
                .subscribe(printerSubscriber);
    }

    /**
     * 打印结果前，做额外操作。保存数据
     * doOnNext操作符用法
     *
     */
    static void printer6() {
        query()
                .flatMap(new Func1<List<String>, Observable<String>>() {
                    @Override
                    public Observable<String> call(List<String> strings) {
                        return Observable.from(strings);
                    }
                })
                .flatMap(new Func1<String, Observable<String>>() {
                    @Override
                    public Observable<String> call(String s) {
                        return getTitle(s);
                    }
                })
                .doOnNext(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        //输出结果前做一些额外事情
                        saveTitle(s);
                    }
                })
                .subscribe(printerSubscriber);
    }

    /**
     * 保存标题
     *
     * @param title
     */
    static void saveTitle(String title) {
        System.out.println("save title---->" + title);
    }

    static Observable<String> getTitle(String url) {
        Observable titleObservable;
        if (url.startsWith("www")) {
            titleObservable = Observable.just(url + ":title");
        } else {
            return null;
        }
        return titleObservable;
    }

    /**
     * 被观察者
     * 一个查询操作，返回查询结果列表
     *
     * @return
     */
    static Observable<List<String>> query() {
        List<String> urls = new ArrayList<String>();
        urls.add("www.baidu.com");
        urls.add("www.jd.com");
        urls.add("114.com");
        urls.add("www.taobao.com");
        urls.add("www.google.com");
        Observable<List<String>> myObservable = Observable.just(urls);
        return myObservable;

    }

    /***
     * 打印查询结果
     * 观察者
     */
    static Subscriber<String> printerSubscriber = new Subscriber<String>() {
        @Override
        public void onCompleted() {

        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(String s) {
            System.out.println(s);
        }
    };


}
