package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString() {
        return "start state";
    }
}
