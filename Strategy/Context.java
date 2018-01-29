public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int nr1, int nr2) {
        return strategy.doOperation(nr1, nr2);
    }
}
