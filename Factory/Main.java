class Main {
    public static void main(String[] args) {
        Shape[] myShapes = new Shape[3];
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                myShapes[i] = ShapeFactory.getShape("circle");
            }

            if (i == 1) {
                myShapes[i] = ShapeFactory.getShape("square");
            }

            if (i == 2) {
                myShapes[i] = ShapeFactory.getShape("triangle");
            }
        }
    }
}
