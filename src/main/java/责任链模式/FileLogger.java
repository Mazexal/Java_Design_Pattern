package 责任链模式;

/**
 * Created by 10235 on 2017/8/20.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }


    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}