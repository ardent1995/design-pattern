package observerpattern.demo2;

public class ObserverPatternEx {
    public static void main(String[] args) {
        Subject1 subject1 = new Subject1();
        Subject2 subject2 = new Subject2();

        IObserver observer1 = new Observer1();
        IObserver observer2 = new Observer2();
        IObserver observer3 = new Observer3();

        subject1.register(observer1);
        subject1.register(observer2);

        subject2.register(observer2);
        subject2.register(observer3);

        System.out.println("Setting flag = 5 at Subject1");
        subject1.setFlag(5);
        System.out.println("Setting flag = 25 at Subject2");
        subject2.setFlag(25);
        subject1.unregister(observer2);
        System.out.println("Setting flag = 50 at Subject1 & Subject2");
        subject1.setFlag(50);
        subject2.setFlag(50);
    }
}
