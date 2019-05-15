package leo.sz.com.designpatters.BehavioralPattern.p12BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：leo
 * @date：2019/5/15
 * @email：lei.lu@e-at.com
 */
public class Invoker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
