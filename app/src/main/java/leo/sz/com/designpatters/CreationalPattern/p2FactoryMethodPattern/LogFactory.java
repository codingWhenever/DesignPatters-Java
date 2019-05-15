package leo.sz.com.designpatters.CreationalPattern.p2FactoryMethodPattern;

/**
 * 工厂方法模式(Factory Method Pattern)又称为工厂模式，
 * 也叫虚拟构造器(Virtual Constructor)模式或者多态工厂(Polymorphic Factory)模式，
 * 它属于类创建型模式。在工厂方法模式中，工厂父类负责定义创建产品对象的公共接口，
 * 而工厂子类则负责生成具体的产品对象，这样做的目的是将产品类的实例化操作延迟到工厂子类中完成，
 * 即通过工厂子类来确定究竟应该实例化哪一个具体产品类。
 * <p>
 * 工厂方法模式包含如下角色：
 * <p>
 * Product：抽象产品
 * ConcreteProduct：具体产品
 * Factory：抽象工厂
 * ConcreteFactory：具体工厂
 *
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public abstract class LogFactory<T extends Log> {
    abstract T createLog();
}
