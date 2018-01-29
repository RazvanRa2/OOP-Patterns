public class Main {
    public static void main(String[] args) {
        Square sq = new Square();
        SquareAdapter sqAdapt = new SquareAdapter(sq);
        sqAdapt.draw(1,2,3,4);
    }
}
