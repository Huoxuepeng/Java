package equation;
/* Напишите программу, где пользователь вводит любое целое положительное число. 
А программа суммирует все числа от 1 до введенного пользователем числа.*/
import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("enter a number: ");
        n = in.nextInt();
        for(int i = 1; i < n; i++){
            sum += i;
        }
        System.out.println("result = " +sum);

    }
}
