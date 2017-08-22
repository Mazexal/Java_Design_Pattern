package 观察者模式;

/**
 * Created by 10235 on 2017/8/22.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
