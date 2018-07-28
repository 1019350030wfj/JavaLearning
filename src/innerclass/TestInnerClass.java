package innerclass;

/**
 * Created by Administrator on 2018/5/29.
 */
public class TestInnerClass {

    private int age;

    public class InnerClass{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
