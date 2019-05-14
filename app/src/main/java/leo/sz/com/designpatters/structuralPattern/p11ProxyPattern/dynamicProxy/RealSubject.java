package leo.sz.com.designpatters.structuralPattern.p11ProxyPattern.dynamicProxy;

/**
 * @author：leo
 * @date：2019/5/14
 * @email：lei.lu@e-at.com
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject request");
    }
}
