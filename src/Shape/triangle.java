package Shape;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/24.
 */
class Triangle extends ShapeTest{

    @Override
    public void round() {
        Scanner hr1 = new Scanner(System.in);
        Scanner hr2 = new Scanner(System.in);
        Scanner hr3 = new Scanner(System.in);
        double num1 = hr1.nextInt();
        double num2 = hr2.nextInt();
        double num3 = hr3.nextInt();
        System.out.print((num1+num2+num3));
    }
    @Override
    public void area() {
        Scanner hr1 = new Scanner(System.in);
        Scanner hr2 = new Scanner(System.in);
        double num1 = hr1.nextInt();
        double num2 = hr2.nextInt();
        System.out.print((num1*num2)/2);
    }
    public static void main(String[] args){

    }

}
