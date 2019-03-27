import java.util.Scanner;

public class CommissionCalculate {
    public static void main(String[]args){
        int salesid;
        String sellername;
        double salesamount;
        int salarybasic;
        double commission=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salesid");
        salesid = sc.nextInt();
        System.out.println("Enter sellername");
        sellername = sc.next();
        System.out.println("Enter salesamount");
        salesamount = sc.nextDouble();
        System.out.println("Enter salarybasic");
        salarybasic = sc.nextInt();

       if (salesamount >= 50000)
         commission = salesamount*35/100;
       if (salesamount >= 30000 && salesamount<50000)
           commission = salesamount*20/100;
       if (salesamount >=20000 && salesamount<30000)
           commission = salesamount*10/100;
       if (salesamount >=10000 && salesamount<20000)
           commission = salesamount*5/100;
       if (salesamount <=10000)
           commission = salesamount*2/100;
       System.out.println("commission " + commission);
    }
}
