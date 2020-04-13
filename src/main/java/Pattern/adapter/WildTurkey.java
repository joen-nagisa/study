package Pattern.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gogoo() {
        System.out.println("WildTurkey : 'gogo~~o`~~~'");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey fly a short distance");
    }
}
