package leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
