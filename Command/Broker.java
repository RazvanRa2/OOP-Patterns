import java.util.LinkedList;

public class Broker {
    private LinkedList<Order> ordersList = new LinkedList<Order>();

    public void takeOrder(Order order) {
        ordersList.add(order);
    }

    public void placeOrders() {
        for(Order order : ordersList) {
            order.execute();
        }
    }
}
