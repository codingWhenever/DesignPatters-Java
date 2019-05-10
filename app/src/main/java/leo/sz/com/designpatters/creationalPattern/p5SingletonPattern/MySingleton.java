package leo.sz.com.designpatters.creationalPattern.p5SingletonPattern;

/**
 * @author：leo
 * @date：2019/5/10
 * @email：lei.lu@e-at.com
 */
public class MySingleton {
    private static MySingleton instance;

    public static MySingleton getInstance() {
        if (null == instance) {
            instance = new MySingleton();
        }
        return instance;
    }

    public void getInfo() {
        System.out.println(this.toString());
    }
}
