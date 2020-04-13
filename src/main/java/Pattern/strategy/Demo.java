package Pattern.strategy;

/**
 * 策略模式 将一个类的方法或行为可以在运行时更改
 */
public class Demo {
    public static void main(String[] args) {
        Strategy strategy = new OperationAdd();
        Context c = new Context(strategy);
        c.executeStrategy(2,1);
    }
}
