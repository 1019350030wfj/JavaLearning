package throwables;

public class TryCatchFinally {

    public static void main(String[] args){
        int result = f(2);
        System.out.println("result = [" + result + "]");
    }

    private static int f(int n) {
        try {
            int r = n*n;
            System.out.println("r = [" + r + "]");
            return r;
        }finally {
            System.out.println("r = 0");
            return 0;
        }
    }
}
