package Gavin_Study_Group.Interview_Jan01;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }


    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}
