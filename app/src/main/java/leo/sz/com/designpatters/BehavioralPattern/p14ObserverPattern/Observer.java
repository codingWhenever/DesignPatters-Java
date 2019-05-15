package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public abstract class Observer {
    protected Subject mSubject;

    public abstract void update();
}
