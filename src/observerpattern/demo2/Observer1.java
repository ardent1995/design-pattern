package observerpattern.demo2;

public class Observer1 implements IObserver{
    @Override
    public void update(String s, int flag) {
        System.out.println("Observer1: The flag value in "+s+" is now :"+flag);
    }
}
