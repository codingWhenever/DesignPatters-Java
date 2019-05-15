package leo.sz.com.designpatters.StructuralPattern.p8DecoratorPattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        //添加相关业务
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("addBehavior BBBB");
    }
}
