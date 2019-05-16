package leo.sz.com.designpatters.BehavioralPattern.p15StatePattern;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class ConcreteStateA implements IState {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
