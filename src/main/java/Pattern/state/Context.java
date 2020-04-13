package Pattern.state;

public class Context {
    private State state;
    Context(){
        state = null;
    }
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return state;
    }
    public void start(){
        getState().start(this);
    }
    public void close(){
        getState().close(this);
    }
}
