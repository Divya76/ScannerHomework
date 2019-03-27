import java.util.Scanner;

public class PassFail {
    public static void main(String[]args){
        String StudentName;
        int RollNo;
        int Subject1Marks,Subject2Marks,Subject3Marks;
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        StudentName = sc.next();
        System.out.println("Enter Roll No");
        RollNo = sc.nextInt();
        System.out.println("Enter Subject1 Marks ");
        Subject1Marks = sc.nextInt();
        System.out.println("Enter Subject2 Marks");
        Subject2Marks = sc.nextInt();
        System.out.println("Enter Subject3 Marks");
        Subject3Marks = sc.nextInt();
        result = (Subject1Marks+Subject2Marks+Subject3Marks);
        result = (result*100)/300;
        if (result<35)
            System.out.println("You are fail.");
        else
            System.out.println("You are passed");
    }
}
