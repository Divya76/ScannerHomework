import java.util.Scanner;

public class NumberAlphabetSymbol {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //char InputChar;
        char InputChar = sc.next().charAt(0);
        if (InputChar >= 48 && InputChar <= 60)
            System.out.println("char is number");

        else if (InputChar >= 65 && InputChar <= 90) //|| (char = 'a'  char<= 'z')){
            System.out.println(" char is alphabet");

        else
            System.out.println("char is symbol");

    }
}
