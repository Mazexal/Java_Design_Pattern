package 空对象模式;

/**
 * Created by 10235 on 2017/8/21.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public boolean isNil() {
        return false;
    }
}
