package JavaTest;
import static java.lang.System.out;

/**
 * Created by Administrator on 2016/9/24.
 */
public class StaticClassTest {
    private String a;
    private static String b;
    public void m(){
        a = "abcd";
        b = "bcde";
    }
    public static void n(){
        String a = "abc";
        b = "bcd";
    }
    public static void main(){

    }
}
