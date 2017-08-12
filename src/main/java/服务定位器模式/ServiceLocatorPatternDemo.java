package 服务定位器模式;

/**
 * Created by 10235 on 2017/8/12.
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
