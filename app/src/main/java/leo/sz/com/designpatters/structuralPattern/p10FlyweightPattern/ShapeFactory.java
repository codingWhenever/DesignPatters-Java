package leo.sz.com.designpatters.structuralPattern.p10FlyweightPattern;

import java.util.HashMap;

/**
 * 享元模式(Flyweight Pattern)：运用共享技术有效地支持大量细粒度对象的复用。
 * 系统只使用少量的对象，而这些对象都很相似，状态变化很小，可以实现对象的多次复用。
 * 由于享元模式要求能够共享的对象必须是细粒度对象，因此它又称为轻量级模式，它是一种对象结构型模式。
 * <p>
 * 享元模式包含如下角色：
 * <p>
 * Flyweight: 抽象享元类
 * ConcreteFlyweight: 具体享元类
 * UnsharedConcreteFlyweight: 非共享具体享元类
 * FlyweightFactory: 享元工厂类
 *
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circles = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circles.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circles.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
