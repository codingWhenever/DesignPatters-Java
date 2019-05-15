package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyAllObservers();
}
