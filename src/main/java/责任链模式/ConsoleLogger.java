package 责任链模式;

/**
 * Created by 10235 on 2017/8/20.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }


    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}