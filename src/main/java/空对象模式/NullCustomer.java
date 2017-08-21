package 空对象模式;

/**
 * Created by 10235 on 2017/8/21.
 */
public class NullCustomer extends AbstractCustomer {


    public String getName() {
        return "Not Available in Customer Database";
    }


    public boolean isNil() {
        return true;
    }
}
