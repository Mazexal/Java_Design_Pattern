package 访问者模式;

/**
 * Created by 10235 on 2017/8/23.
 */
public class Mouse  implements ComputerPart {


    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}