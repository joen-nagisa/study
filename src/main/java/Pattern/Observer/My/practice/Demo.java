package Pattern.Observer.My.practice;

public class Demo {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Client clinet1 = new Client(remote);

        remote.update(1,2,3);

        Client client2 = new Client(remote);
        remote.update(3,4,5);
    }
}
