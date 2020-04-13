package concurrence;

public class MyThreadInfo extends Thread {
    @Override
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThreadInfo thread = new MyThreadInfo();
        thread.start();

        System.out.println("线程的唯一标识"+thread.getId());         //14
        System.out.println("线程的名称"+thread.getName());           //thread-0
        System.out.println("线程的状态"+thread.getState());         //TERMINATED     6种状态
        System.out.println("线程的优先级"+thread.getPriority());    //5   1》10    最高10
    }
}
