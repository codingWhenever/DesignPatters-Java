package leo.sz.com.designpatters.structuralPattern.p6AdapterPattern;

/**
 * @author：leo
 * @date：2019/5/13
 * @email：lei.lu@e-at.com
 */
public class Adapter extends Adaptee implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request1() {
        this.adaptee.request1();
    }

    @Override
    public void request2() {
        System.out.println("request2 from adapter...");
    }
}
