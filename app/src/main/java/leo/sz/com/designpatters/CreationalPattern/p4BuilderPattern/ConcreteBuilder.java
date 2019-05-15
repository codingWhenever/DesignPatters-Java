package leo.sz.com.designpatters.CreationalPattern.p4BuilderPattern;

/**
 * @author：leo
 * @date：2019/5/10
 * @email：lei.lu@e-at.com
 */
public class ConcreteBuilder {
    private Product product;

    public ConcreteBuilder(Product product) {
        this.product = product;
    }

    ConcreteBuilder buildPartA() {
        product.setA(" A Style ");
        return this;
    }

    ConcreteBuilder buildPartB() {
        product.setB(" B Style ");
        return this;
    }

    ConcreteBuilder buildPartC() {
        product.setC(" C Style ");
        return this;
    }

    public Product getResult() {
        return product;
    }


}
