package observerpattern.demo;

public class ObserverPatternEx {
    public static void main(String[] args) {
        Observer observer = new Observer();
        Subject subject = new Subject();
        subject.register(observer);
        System.out.println("Setting flag = 5");
        subject.setFlag(5);
        System.out.println("Setting flag = 25");
        subject.setFlag(25);
        subject.unregister(observer);
        System.out.println("Setting flag = 50");
        subject.setFlag(50);
    }
}
