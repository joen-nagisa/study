package Pattern.strategy;

public class Context {
    Strategy strategy;
    Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int a,int b){
        return strategy.doOperation(a,b);
    }
}
