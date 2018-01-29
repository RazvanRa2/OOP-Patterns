public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        HexaObserver ho = new HexaObserver(subject);
        OctalObserver oo = new OctalObserver(subject);
        BinaryObserver bo = new BinaryObserver(subject);

        subject.setState(10);
        subject.setState(15);
        subject.setState(37);
    }
}
