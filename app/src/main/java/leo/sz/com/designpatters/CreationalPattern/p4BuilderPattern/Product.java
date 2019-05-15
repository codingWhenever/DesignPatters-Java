package leo.sz.com.designpatters.CreationalPattern.p4BuilderPattern;

/**
 * @author：leo
 * @date：2019/5/10
 * @email：lei.lu@e-at.com
 */
public class Product {
    private String A;
    private String B;
    private String C;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    @Override
    public String toString() {
        return "Product{" +
                "A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                '}';
    }

    public void show() {
        System.out.println(this.toString());
    }
}
