package leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern;

/**
 * @author：leo
 * @date：2020/5/11
 * @email：lei.lu@e-at.com
 */
public abstract class AbsLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    //链中的下一个节点
    protected AbsLogger nextLogger;

    public void setNextLogger(AbsLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}
