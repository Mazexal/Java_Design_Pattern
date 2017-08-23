package 访问者模式;

/**
 * Created by 10235 on 2017/8/23.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {


    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }


    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }


    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }


    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}