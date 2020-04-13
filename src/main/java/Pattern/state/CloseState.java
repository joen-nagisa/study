package Pattern.state;

public class CloseState implements State {
    @Override
    public void start(Context context) {
        context.setState(new StartState());
        System.out.println("start state");
    }

    @Override
    public void close(Context context) {

    }
}
