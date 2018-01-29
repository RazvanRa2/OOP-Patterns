public class SquareAdapter implements Shape {
    private Square square;

    public SquareAdapter(Square square) {
        System.out.println("Sq was adapted to Shape interface");
        this.square = square;
    }
    public void draw(int x, int y, int a, int b) {
        System.out.println("Calling draw from deprecated square");
        square.draw(x,y,a,b);
    }
}
