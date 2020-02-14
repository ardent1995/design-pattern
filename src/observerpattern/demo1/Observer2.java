package observerpattern.demo1;

public class Observer2 implements IObserver {
    @Override
    public void update(int flag) {
        System.out.println("Observer2: The flag value in Subject is now : "+flag);
    }
}
