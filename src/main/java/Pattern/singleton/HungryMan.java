package Pattern.singleton;

/**
 * 饿汉模式，线程安全 类加载机制保证
 */
public class HungryMan {
    private static HungryMan instance = new HungryMan();

    private HungryMan() {
    }

    public static HungryMan getInstance() {
        return instance;
    }
}

/**
 * 懒汉模式，线程不安全，没啥卵用
 */
class Lazzy{
    private static Lazzy instance;
    private Lazzy(){}
    public static Lazzy getInstance(){
        if(null==instance){
           instance=new Lazzy();
        }
        return instance;
    }
}
//线程安全的懒汉，但是效率低
class LazzySafe{
    private static LazzySafe instance;
    private LazzySafe(){}
    public static synchronized LazzySafe getInstance(){
        if(null==instance){
            instance=new LazzySafe();
        }
        return instance;
    }
}

/**
 * 双重检测  安全、实现了懒加载
 */
class DoubleCheck{
    private static volatile DoubleCheck instance;
    private DoubleCheck(){}
    public static DoubleCheck getInstance(){
        if(instance==null){
            synchronized (DoubleCheck.class){
                if(instance==null){
                    instance=new DoubleCheck();
                }
            }
        }
        return instance;
    }
}

/**
 * 静态内部类    线程安全
 * 利用了 classloader 机制来保证初始化 instance 时只有一个线程
 *  * Indoor内部类如果没被使用就不会实例化，所以也实现了懒加载
 */
class StaticInside{
    private StaticInside(){}
     static class Inside{
        private static StaticInside INSTANCE = new StaticInside();
    }
    public StaticInside getInstance(){
        return Inside.INSTANCE;
    }
}
//枚举，最好的方式
enum  Enums{
    INSTANCE;
    public void method(){

    }
}
