package by.epam.learn.main;
import java.util.Scanner;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class LearnMain {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        System.out.println("The maximum value is :" +max(min(a,b),min(c,d)));
    }
}
/*Найти max{min(a, b), min(c, d)}.*/
