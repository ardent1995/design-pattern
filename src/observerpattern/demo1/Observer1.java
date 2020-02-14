package observerpattern.demo1;

public class Observer1 implements IObserver{
    @Override
    public void update(int flag) {
        System.out.println("Observer1: The flag value in Subject is now: "+flag);
    }
}
