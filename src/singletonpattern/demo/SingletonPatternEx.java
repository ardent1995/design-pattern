package singletonpattern.demo;

public class SingletonPatternEx {
    public static void main(String[] args) {
        System.out.println("Trying to get instance.....");
        Singleton instance1 = Singleton.getInstance();
        System.out.println("Trying to get instance.....");
        Singleton instance2 = Singleton.getInstance();
        if(instance1 == instance2){
            System.out.println("instance1 & instance2 are same instance");
        }
    }
}
