package by.epam.learn.main;
import java.util.Scanner;


public class MAth {
    public static void main(String[] args) {
        int a,b,c,z;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        System.out.println("the value of z is: " +(((a - 3) * b / 2) + c));
    }
}
