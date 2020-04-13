package Pattern.state;

public class StartState implements State {
    @Override
    public void start(Context context) {

    }

    @Override
    public void close(Context context) {
        context.setState(new CloseState());
        System.out.println("close state");
    }
}
