import java.util.Scanner;

public class InterchangeNumber {
    public static void main(String[]args){
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        c = b;
        b = a;
        a = c;

        System.out.println("a=" + a );
        System.out.println("b= " + b);
    }

}
