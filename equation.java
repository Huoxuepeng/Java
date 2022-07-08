package equation;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        System.out.println("enter the value of x: ");
        x = in.nextInt();
        if(x <= 3){
            System.out.println("result= " +(Math.pow(x,2)- 3*x +9));
        }else{
            System.out.println("result = " +(1 / ((Math.pow(x,3))+6)));
        }
    }
}
/*
package equation;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        double result;
        System.out.println("enter the value of x: ");
        x = in.nextInt();
        if(x <= 3){
           result= (Math.pow(x,2)- 3*x +9);
        }else{
            result = 1 / ((Math.pow(x,3))+6);
        }
        System.out.println("when x = " + x +" ,F(x) = " +result);
    }
}

*/
