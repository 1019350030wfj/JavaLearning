package studystatic;

public class TestStaticInherit {

    public static void main(String[] args) {
        Parent son = new Son();
        son.staticMethod();
        son.method();

        Son s = new Son();
        s.staticMethod();
        s.method();

    }
}
