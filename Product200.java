/*Составить программу нахождения произведения квадратов первых двухсот чисел.*/
package equation;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum = 1;
        for(int i = 1; i <= 200; i++){
            sum *= Math.pow(i,2);
        }
        System.out.println("result = " +sum);

    }
}
