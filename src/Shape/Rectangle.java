package Shape;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Rectangle extends ShapeTest{

    @Override
    public void round() {
        Scanner hr1 = new Scanner(System.in);
        Scanner hr2 = new Scanner(System.in);
        double num1 = hr1.nextInt();
        double num2 = hr2.nextInt();

        System.out.print((2*num1)+(2*num2));
    }
    @Override
    public void area() {
        Scanner hr1 = new Scanner(System.in);
        Scanner hr2 = new Scanner(System.in);
        double num1 = hr1.nextInt();
        double num2 = hr2.nextInt();
        System.out.print((num1*num2));
    }
}
