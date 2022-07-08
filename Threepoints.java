package CoordinatesXY;

import java.util.Scanner;

public class CoordinatesXY_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coorx1,coory1,coorx2,coory2,coorx3,coory3;
        System.out.println("enter the first coordinate:");
        coorx1 = in.nextInt();
        coory1 = in.nextInt();
        System.out.println("enter the second coordinate:");
        coorx2 = in.nextInt();
        coory2 = in.nextInt();
        System.out.println("enter the third coordinate:");
        coorx3 = in.nextInt();
        coory3 = in.nextInt();
        int result = (coory3 - coory1)*(coorx2 - coorx1) - (coory2 - coory1)* (coorx3 - coorx1);
        if(result == 0){
            System.out.println("three points collinear");
        }else{
            System.out.println("three points are not collinear");
        }

    }
}
