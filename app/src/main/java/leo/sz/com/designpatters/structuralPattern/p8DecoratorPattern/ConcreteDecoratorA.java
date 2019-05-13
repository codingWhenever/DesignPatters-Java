package leo.sz.com.designpatters.structuralPattern.p8DecoratorPattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        //添加相关业务
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("addBehavior AAAA");
    }
}
