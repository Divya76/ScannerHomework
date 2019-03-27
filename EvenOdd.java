import java.util.Scanner;

public class EvenOdd {
    public static void  main(String[]args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value and check if it is odd or even");
        x = sc.nextInt();
       if(x%2==0)
           System.out.println("The number is even");
       else
           System.out.println("The number is odd");


    }
}
