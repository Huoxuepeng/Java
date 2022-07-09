package equation;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < Character.MAX_VALUE; i++) {
            System.out.println("number " + i + " matches character" + (char) i);
        }
    }
}
