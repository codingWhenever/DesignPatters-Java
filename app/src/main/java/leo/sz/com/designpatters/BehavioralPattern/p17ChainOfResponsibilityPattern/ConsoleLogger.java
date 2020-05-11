package leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern;

/**
 * @author：leo
 * @date：2020/5/11
 * @email：lei.lu@e-at.com
 */
public class ConsoleLogger extends AbsLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("standard console logger :" + message);
    }
}
