package 服务定位器模式;

/**
 * Created by 10235 on 2017/8/12.
 */
public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }


    public String getName() {
        return "Service1";
    }
}
