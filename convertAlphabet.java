import java.util.Scanner;

public class convertAlphabet {
    public static void main(String[]args){
        String A;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give name in uppercase case");
        A = sc.next();
        System.out.println("you entered " + A.toLowerCase());
    }
}
