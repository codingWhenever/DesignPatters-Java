package leo.sz.com.designpatters.creationalPattern.p2FactoryMethodPattern;

/**
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public class FileLogFactory extends LogFactory<FileLog> {
    @Override
    FileLog createLog() {
        return new FileLog();
    }
}
