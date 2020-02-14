package observerpattern.demo2;

public class Observer3 implements IObserver {
    @Override
    public void update(String s, int flag) {
        System.out.println("Observer3: The flag value in "+s+" is now: "+flag);
    }
}
