import java.util.Scanner;

public class LeapYear {
    public static void main(String[]args){
        int x;
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a year");

        x = SC.nextInt();
        if ((x%4==0))
         System.out.println("its a leap year");
        else
           System.out.println("its not a leap year");
    }
}
