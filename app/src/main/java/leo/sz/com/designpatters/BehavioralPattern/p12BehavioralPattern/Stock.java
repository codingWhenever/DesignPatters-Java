package leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ",Quantity:" +
                quantity + " ] bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ",Quantity:"
                + quantity + " ] sold ");
    }
}
