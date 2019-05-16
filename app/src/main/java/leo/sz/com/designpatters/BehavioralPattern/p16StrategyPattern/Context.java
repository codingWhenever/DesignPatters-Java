package leo.sz.com.designpatters.BehavioralPattern.p16StrategyPattern;

/**
 * @author：leo
 * @date：2019/5/16
 * @email：lei.lu@e-at.com
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
