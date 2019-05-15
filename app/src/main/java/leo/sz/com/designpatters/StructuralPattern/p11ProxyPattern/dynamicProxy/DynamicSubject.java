package leo.sz.com.designpatters.StructuralPattern.p11ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author：leo
 * @date：2019/5/14
 * @email：lei.lu@e-at.com
 */
public class DynamicSubject implements InvocationHandler {
    private Object sub;

    public DynamicSubject(Object object) {
        this.sub = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        method.invoke(sub, args);
        System.out.println("after calling " + method);
        return null;
    }
}
