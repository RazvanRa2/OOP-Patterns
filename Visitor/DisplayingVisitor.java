public class DisplayingVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Visiting mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Visiting keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Visiting monitor");
    }

}
