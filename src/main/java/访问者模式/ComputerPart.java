package 访问者模式;

/**
 * Created by 10235 on 2017/8/23.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}