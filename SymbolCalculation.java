import java.util.Scanner;

public class SymbolCalculation {

    public static void main(String[]args){
        int a;
        int b;
        char Symbol;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first value");
        a = sc.nextInt();
        System.out.println("Please enter second value");
        b = sc.nextInt();
        System.out.println("Please enter Symbol");
        Symbol = sc.next().charAt(0);
        if (Symbol =='/')
        System.out.println("Result " + (a/b));
        if (Symbol == '*')
        System.out.println("Result" + (a*b));
        if (Symbol == '+')
        System.out.println("Result" + (a+b));
        if (Symbol == '-')
        System.out.println("Result" + (a-b));
    }
}
