package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class ConcreteSubject implements Subject {
    private int state;
    private List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyAllObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
