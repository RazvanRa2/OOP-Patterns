public interface ComputerPartVisitor {
    public void visit(Mouse m);
    public void visit(Keyboard k);
    public void visit(Monitor m);
}
