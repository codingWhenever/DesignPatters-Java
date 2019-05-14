package leo.sz.com.designpatters.structuralPattern.p11ProxyPattern.staticProxy;

/**
 * 代理模式(Proxy Pattern) ：给某一个对象提供一个代 理，并由代理对象控制对原对象的引用。
 * 代理模式的英 文叫做Proxy或Surrogate，它是一种对象结构型模式。
 * <p>
 * 代理模式包含如下角色：
 * <p>
 * Subject: 抽象主题角色
 * Proxy: 代理主题角色
 * RealSubject: 真实主题角色
 *
 * @author：leo
 * @date：2019/5/14
 * @email：lei.lu@e-at.com
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
    }

    @Override
    public void request() {
        preRequest();
        realSubject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("Proxy:preRequest");
    }

    private void postRequest() {
        System.out.println("Proxy:postRequest");
    }
}
