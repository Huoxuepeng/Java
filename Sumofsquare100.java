package equation;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += Math.pow(i,2);
        }
        System.out.println("result = " +sum);

    }
}
/*Найти сумму квадратов первых ста чисел.*/
