package leo.sz.com.designpatters.CreationalPattern.p2FactoryMethodPattern;

/**
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public class FileLog extends Log {
    @Override
    void writeLog() {
        FileLog log = new FileLogFactory().createLog();
    }
}
