package singletonpattern.demo2;

//Bill Pugh approach
public class Singleton {
    private Singleton(){}

    private static class SingletonHelper{
        //Nested class is referenced after getInstance() is called
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
