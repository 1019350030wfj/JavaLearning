package studystatic;

/**
 * Created by Administrator on 2018/5/23.
 */
public class Parent {

    protected static int field = 66;

    public static void  staticMethod(){
        System.out.println("Parent staticMethod run");

    }
    public void method(){
        System.out.println("Parent method run");
    }
}
