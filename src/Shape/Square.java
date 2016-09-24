package Shape;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Square extends ShapeTest{

    @Override
    public void round() {
        Scanner hr = new Scanner(System.in);
        double num = hr.nextInt();
        System.out.print((4*num));
    }
    @Override
    public void area() {
        Scanner hr = new Scanner(System.in);
        double num = hr.nextInt();
        System.out.print((num*num));
    }
}
