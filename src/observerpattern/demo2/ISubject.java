package observerpattern.demo2;

public interface ISubject {
    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObserver(int flag);
}
