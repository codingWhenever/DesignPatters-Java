package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class GContext {
    private IState state;

    public void setState(IState state) {
        this.state = state;
    }

    public void request(String sampleParameter) {
        state.handle(sampleParameter);
    }
}
