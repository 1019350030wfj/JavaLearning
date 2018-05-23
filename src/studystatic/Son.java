package studystatic;

/** https://www.cnblogs.com/kabi/p/5181941.html
 * Created by Administrator on 2018/5/23.
 */
public class Son extends Parent {

    private static Parent parent;

    public static void  staticMethod(){
//        super.field = 33;
//        System.out.println("Son staticMethod run" + super.field);

    }
    public void method(){
        System.out.println("Son method run");

    }

}
