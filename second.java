package by.epam.learn.main;
import java.util.Scanner;
public class LearnMain {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double a,b,c,d,m;
       System.out.println("the value of a = ");
       a = in.nextInt();
       System.out.println("the value of b = ");
       b = in.nextInt();
       System.out.println("the value of c = ");
       c = in.nextInt();
       d = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a);
       m = c *Math.pow(a,3) + Math.pow(b,-2);
       System.out.println("the value of result = " +(d-m));
    }
}
