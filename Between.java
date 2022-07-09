package showFactor;
import java.util.Scanner;
public class showFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("enter two numbers: ");
        n = in.nextInt();
        m = in.nextInt();
        System.out.println("The numbers between m and n are: ");
        for(int i = n+1;i < m; i++){
            if (i % 1 == 0){
                System.out.println(i);
            }
        }
    }

}
