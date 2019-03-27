import java.util.Scanner;

public class VoteEligiblity {
    //Declare the main method
    public static void main(String[]args){
        int user = 19;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user age");
        user = sc.nextInt();
        // checking the user eligiblity
        if (user >= 18)
            System.out.println("user is eligible for vote");

        else if  (user < 18)
            System.out.println("user is not eligible for vote");


    }

}
