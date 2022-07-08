package by.epam.learn.main;
import java.util.Scanner;
public class LearnMain {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("The angle of a is: ");
        a = in.nextInt();
        System.out.println("The angle of b is: ");
        b = in.nextInt();
        c = 180 - a - b;
        if(c > 0){
            System.out.println("there is a known triangle");
            if(a == 90||b == 90|| c == 90)
                System.out.println("A known triangle is a right triangle");
        }else
            System.out.println("there is not a known triangle");
    }
}
/* Даны два угла треугольника (в градусах).
   Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.*/
