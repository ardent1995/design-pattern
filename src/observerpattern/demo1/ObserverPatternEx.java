package observerpattern.demo1;

public class ObserverPatternEx {
    public static void main(String[] args) {
        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();
        Subject subject = new Subject();
        subject.register(observer1);
        subject.register(observer2);
        System.out.println("Setting flag = 5");
        subject.setFlag(5);
        System.out.println("Setting flag = 25");
        subject.setFlag(25);
        subject.unregister(observer1);
        System.out.println("Setting flag = 50");
        subject.setFlag(50);
    }
}
