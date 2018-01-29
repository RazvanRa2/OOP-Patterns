public class Main {
    public static void main(String[] args) {
        Broker myBroker = new Broker();

        Stock stock = new Stock();
        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        myBroker.takeOrder(buyStockOrder);
        myBroker.takeOrder(buyStockOrder);
        myBroker.takeOrder(buyStockOrder);

        myBroker.takeOrder(sellStockOrder);
        myBroker.takeOrder(sellStockOrder);
        myBroker.takeOrder(sellStockOrder);

        myBroker.placeOrders();
    }
}
