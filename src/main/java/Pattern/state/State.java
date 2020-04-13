package Pattern.state;

public interface State {
    void start(Context context);
    void close(Context context);
}
