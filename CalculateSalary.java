import java.util.Scanner;

public class CalculateSalary {
    //Declare main method
    public static void main(String[]args){
        int employeeid;
        String name;
        int salary;
        double HRA,DA,TA,PF;
        Scanner sc = new Scanner(System.in);
        System.out.println("Print emp id");
        employeeid = sc.nextInt();
        System.out.println("print name");
        name = sc.next();
        System.out.println("print salary");
        salary = sc.nextInt();
        // function to calculate salary
        HRA = salary * 10/100;
        DA = salary * 8/100;
        TA = salary * 9/100;
        PF = salary * 20/100;
        System.out.println("Gross Salary " + (salary+HRA+DA+TA+PF));

    }

}
