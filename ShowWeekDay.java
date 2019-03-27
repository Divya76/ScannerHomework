import java.util.Scanner;

public class ShowWeekDay {
    public static void main(String[]args){
        int wday;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please print day name");
        wday = sc.nextInt();
        if (wday == 1)
            System.out.println("Monday");
        else if (wday == 2)
            System.out.println("Tuesday");
        else if (wday == 3)
            System.out.println("Wednesday");
        else if (wday == 4)
            System.out.println("Thursday");
        else if (wday == 5)
            System.out.println("Friday");
       else if (wday == 6)
            System.out.println("Saturday");
      else   if (wday == 7)
            System.out.println("Sunday");

    }
}
