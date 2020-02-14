package singletonpattern.demo;

public class Singleton {
    private static Singleton INSTANCE;
    private Singleton(){}

    // To make it thread-safe you can use synchronized keyword
    //With this solution we need to pay for the performance cost associated with this synchronized method
    public static Singleton getInstance(){
        //Lazy initialization
        if(INSTANCE == null){
            INSTANCE = new Singleton();
            System.out.println("New instance created");
        }else {
            System.out.println("You have already created instance");
        }
        return INSTANCE;
    }
}
