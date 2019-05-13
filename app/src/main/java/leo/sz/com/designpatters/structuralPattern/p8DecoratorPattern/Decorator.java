package leo.sz.com.designpatters.structuralPattern.p8DecoratorPattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        this.component.sampleOperation();
    }
}
