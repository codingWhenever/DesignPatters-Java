package leo.sz.com.designpatters.BehavioralPattern.p17ChainOfResponsibilityPattern;

/**
 * @author：leo
 * @date：2020/5/11
 * @email：lei.lu@e-at.com
 */
public class FileLogger extends AbsLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file logger:" + message);
    }
}
