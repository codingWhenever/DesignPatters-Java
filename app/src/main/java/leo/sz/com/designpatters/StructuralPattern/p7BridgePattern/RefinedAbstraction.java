package leo.sz.com.designpatters.StructuralPattern.p7BridgePattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class RefinedAbstraction extends Abstraction {


    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("do something else, and then ");
        this.getImplementor().operationImp();
    }
}
