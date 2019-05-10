package leo.sz.com.designpatters.creationalPattern.p3AbstractFactoryPattern;

/**
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public class ConcreteFactory2 extends AbsFactory {

    @Override
    public AbsProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbsProductB createProductB() {
        return new ProductB2();
    }
}
