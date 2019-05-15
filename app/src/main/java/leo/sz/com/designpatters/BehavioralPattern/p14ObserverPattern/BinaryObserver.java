package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        mSubject = subject;
        mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(((ConcreteSubject) mSubject).getState()));
    }
}
