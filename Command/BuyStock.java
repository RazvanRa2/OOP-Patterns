public class BuyStock implements Order{
    private Stock boughtStock;

    public BuyStock(Stock newStock) {
        this.boughtStock = newStock;
    }

    public void execute() {
        boughtStock.buy();
    }
}
