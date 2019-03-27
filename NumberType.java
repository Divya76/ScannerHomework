import java.util.Scanner;

public class NumberType {
    public static void main(String[]args){
        int number=111;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        if (number>0){
            System.out.println(number+"it is a positive number");

        }
        else if (number<0){
            System.out.println(number+"it is a negative number ");
        }
        else
        {
            System.out.println(number+ "its zero");

        }
    }
}
