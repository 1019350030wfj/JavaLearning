package innerclass;

/**
 * Created by Administrator on 2018/5/29.
 */
public class Outter {

    public static void main(String[] args){

    TestInnerClass testInnerClass = new TestInnerClass();
    TestInnerClass.InnerClass innerClass = testInnerClass.new InnerClass();
    }
}
