package showFactor;
import java.util.Scanner;
public class showFactor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,m;
        System.out.println("enter two numbers: ");
        n = in.nextInt();
        m = in.nextInt();
        for (int i = n; i <= m;i++){
            new showFactor(i);
        }
    }
    public showFactor(int i) {
        System.out.print("number "+i+" factor: ");
        for (int j = 2; j <=i/2; j++) {
            if(i%j==0){
                System.out.print(j+",");
            }
        }
        System.out.println();
    }

}
