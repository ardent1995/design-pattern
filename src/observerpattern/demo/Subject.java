package observerpattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int flag;
    List<Observer> observerList = new ArrayList<>();

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }
}
