package leo.sz.com.designpatters.BehavioralPattern.p14ObserverPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        mSubject = subject;
        mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(((ConcreteSubject) mSubject).getState()));
    }
}
