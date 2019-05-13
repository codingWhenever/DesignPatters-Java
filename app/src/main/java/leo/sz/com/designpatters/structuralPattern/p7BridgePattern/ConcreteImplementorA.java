package leo.sz.com.designpatters.structuralPattern.p7BridgePattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImp() {
        System.out.println("operationImp from A");
    }
}
