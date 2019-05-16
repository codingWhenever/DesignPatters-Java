package leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
