import java.util.LinkedList;
class Main {
    public static void main(String[] args) {
        LinkedList<ComputerPart> partsList = new LinkedList<ComputerPart>();
        partsList.add(new Keyboard());
        partsList.add(new Monitor());
        partsList.add(new Mouse());

        DisplayingVisitor myVisitor = new DisplayingVisitor();

        for (ComputerPart cp : partsList) {
            cp.accept(myVisitor);
        }
    }
}
