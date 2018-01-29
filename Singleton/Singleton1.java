class Singleton {
    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}

class Test {
    public static void main(String[] args) {
        Singleton singleObj = Singleton.getInstance();
    }
}
