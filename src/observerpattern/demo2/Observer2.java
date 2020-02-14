package observerpattern.demo2;

public class Observer2 implements IObserver {
    @Override
    public void update(String s, int flag) {
        System.out.println("Observer2: The flag value in "+s+" is now :"+flag);
    }
}
