package JavaTest;

/**
 * Created by Administrator on 2016/9/24.
 */
public abstract class AbstractClassTest {
    public void method1(){
        System.out.print("ACT");
    };
    abstract void method2(int i);
    class SubAbstractClassTest extends AbstractClassTest{

        @Override
        void method2(int i) {

        }
    }
}
