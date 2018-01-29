public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new AddStrategy());
        System.out.println(context.executeStrategy(10,5));

        context = new Context(new SubstractStrategy());
        System.out.println(context.executeStrategy(7,6));
    }
}
