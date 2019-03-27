import java.util.Scanner;

public class StudentResult {
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
        System.out.println("Enter Subject Marks ");
        Subject1Marks = sc.nextInt();
        System.out.println("Enter Subject Marks");
        Subject2Marks = sc.nextInt();
        System.out.println("Enter Subject Marks");
        Subject3Marks = sc.nextInt();
        result = (Subject1Marks+Subject2Marks+Subject3Marks);
        result = (result*100)/300;
        if (result>=80)
            System.out.println(" Achieved  A+ Grade");
        if ( result>=60 && result<80)
            System.out.println(" Achieved A Grade");
        if (result>=50 && result < 60)
            System.out.println(" Achieved B Grade ");
        if (result>=35 && result<50)
            System.out.println("Achieved C Grade");
        if (result<35)
            System.out.println("You are fail.");

    }
}
