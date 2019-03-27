import sun.rmi.runtime.NewThreadAction;

import java.util.Scanner;

public class AverageNumber {
    //Declare the main method
    public static void main(String[]args){
        //Declare 5 variables
        int a;
        int b;
        int c;
        int d;
        int e;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Five Numbers");
        a =  sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();

        // Function to calculate average number
        System.out.println("average is" + (a+b+c+d+e)/5);





    }
}
