class Singleton {
    private Singleton() {

    }
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton singleObj = Singleton.getInstance();
    }
}
