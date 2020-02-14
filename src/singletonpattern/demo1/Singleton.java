package singletonpattern.demo1;

public class Singleton {
    //Eager initialization to achieve thread safety
    //Early initialization
    private static Singleton INSTANCE = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
}
//In this solution an object of the singleton class is always instantiated irrespective of calling getInstance() method
//the instance of Singleton Class is created at the time of class loading