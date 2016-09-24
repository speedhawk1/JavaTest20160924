package JavaTest;

/**
 * Created by Administrator on 2016/9/24.
 */
public class TransformTest {
    private String i;
    public static void test(String s) {
        String a = "abc";
        System.out.print(a);
        a = "bcd";
        System.out.print(a);
    }
        public static void main(String[] args){
            String a = "cde";
            System.out.print(a);
            test(a);
            System.out.print(a);

    }
}
