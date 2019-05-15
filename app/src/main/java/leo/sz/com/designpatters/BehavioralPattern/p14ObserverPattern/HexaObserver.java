package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        mSubject = subject;
        mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(((ConcreteSubject) mSubject).getState()));
    }
}
