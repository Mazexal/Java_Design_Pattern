package 备忘录模式;

/**
 * Created by 10235 on 2017/8/16.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
