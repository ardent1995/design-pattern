package singletonpattern.demo1;

public class SingletonPatternEx {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1 == instance2){
            System.out.println("instance1 & instance2 are same instance");
        }
    }
}
