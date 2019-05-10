package leo.sz.com.designpatters.creationalPattern.p4BuilderPattern;

/**
 * @author：leo
 * @date：2019/5/10
 * @email：lei.lu@e-at.com
 */
public class Director {
    private ConcreteBuilder builder;

    public Director() {
    }

    public void setBuilder(ConcreteBuilder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
