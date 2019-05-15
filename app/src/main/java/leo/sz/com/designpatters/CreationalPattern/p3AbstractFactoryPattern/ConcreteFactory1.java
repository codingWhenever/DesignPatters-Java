package leo.sz.com.designpatters.CreationalPattern.p3AbstractFactoryPattern;

/**
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public class ConcreteFactory1 extends AbsFactory {
    @Override
    public AbsProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbsProductB createProductB() {
        return new ProductB1();
    }
}
