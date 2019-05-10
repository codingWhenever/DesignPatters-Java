package leo.sz.com.designpatters.creationalPattern.p1SimpleFactoryPattern;

import leo.sz.com.designpatters.creationalPattern.p1SimpleFactoryPattern.bean.BMWCar;
import leo.sz.com.designpatters.creationalPattern.p1SimpleFactoryPattern.bean.BenzCar;
import leo.sz.com.designpatters.creationalPattern.p1SimpleFactoryPattern.bean.Car;

/**
 * 简单工厂模式(Simple Factory Pattern)：又称为静态工厂方法(Static Factory Method)模式，
 * 它属于类创建型模式。在简单工厂模式中，可以根据参数的不同返回不同类的实例。
 * 简单工厂模式专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
 * <p>
 * Factory：工厂角色
 * 工厂角色负责实现创建所有实例的内部逻辑
 * Product：抽象产品角色
 * 抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口
 * ConcreteProduct：具体产品角色
 * 具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。
 *
 * @author：leo
 * @date：2019/5/9
 * @email：lei.lu@e-at.com
 */
public class CarFactory {

    public static Car createCar(String brand) {
        if (brand.equals("bmw")) {
            return new BMWCar();
        } else if (brand.equals("benz")) {
            return new BenzCar();
        }
        return null;
    }
}
