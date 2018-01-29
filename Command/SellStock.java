public class SellStock implements Order {
    private Stock soldStock;

    public SellStock(Stock newStock) {
        soldStock = newStock;
    }

    public void execute() {
        soldStock.sell();
    }
}
