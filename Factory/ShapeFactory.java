public final class ShapeFactory {

    public static final Shape getShape(String shapeName) {
        if (shapeName.equals("square")) {
            return new Square();
        }
        if (shapeName.equals("circle")) {
            return new Circle();
        }

        return new Triangle();  // no .equals checking, default case
    }
}
