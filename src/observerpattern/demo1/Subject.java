package observerpattern.demo1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int flag;
    List<IObserver> observerList = new ArrayList<>();

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
        notifyObserver(flag);
    }

    @Override
    public void register(IObserver o) {
        observerList.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver(int flag) {
        for(IObserver observer: observerList){
            observer.update(flag);
        }
    }
}
