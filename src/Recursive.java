import java.util.Scanner;


public class Recursive {
    static void asc(int a, int b){
        if(a <= b){
            System.out.print(a + " ");
            asc(a + 1, b);
        }
    }

    static void desc(int a, int b){
        if(a >= b){
            System.out.print(a + " ");
            desc(a - 1, b);
        }
    }

    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Enter first number: ");
        a = scan.nextInt();
        System.out.println("Enter second number: ");
        b = scan.nextInt();

        if(a < b){
            asc(a, b);
        }else if(a > b){
            desc(a, b);
        }else{
            System.out.println(a);
        }

    }
}
