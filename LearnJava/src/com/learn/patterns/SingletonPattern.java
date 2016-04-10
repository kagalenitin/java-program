package com.learn.patterns;

/**
 * Created by nkagale on 3/15/16.
 */
public class SingletonPattern {

    public static void main(String ar[]){
        MySingleton ms = MySingleton.getInstance();
        ms.testMe();
    }
}

class MySingleton{
    private static MySingleton mySingleton;
    static {
        mySingleton = new MySingleton();
    }
    private MySingleton(){

    }

    public static MySingleton getInstance(){
        return mySingleton;
    }

    public void testMe(){
        System.out.println("Hey .. Inside singleton");
    }
}
