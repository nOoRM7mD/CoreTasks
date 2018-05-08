package com.example.lenovo.coretasks;

/**
 * Created by lenovo on 4/8/2018.
 */

public class MyCustomListener {
    //custom interface listener object
    public interface myBasicListenerInterface {
        public void onAction(String action);
    }

    //create instance
    private myBasicListenerInterface listener;

    //initialize it in constructor
    public MyCustomListener() {
        this.listener = null;
    }

    //create listener object setter
    public void setListener(myBasicListenerInterface listener) {
        this.listener = listener;

    }

    //method trigger event listener
    public void doSomething() {
        if (listener != null) {
            listener.onAction("hello !");
        }
    }
}
