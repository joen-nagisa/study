package Pattern.state;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.close();
        context.start();

    }
}
