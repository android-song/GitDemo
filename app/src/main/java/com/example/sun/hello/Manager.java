package com.example.sun.hello;

/**
 * Created by sun on 2017/7/28.
 */

public class Manager {
    private static Manager Manager;
        int i=0;
      String name="";
    int j=0;
    public static Manager getInstance(){
        if (Manager==null){
            Manager=new Manager();
        }

        return Manager;
    }

Listener Listener;
 void   setListener(Listener Listener){
     this.Listener=Listener;
 }
    void click(){
        Listener.response("manager");
    }
}
