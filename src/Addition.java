import java.util.*;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number ");
        int c = sc.nextInt();
        System.out.println("Result is: "+ (a+b+c));
    }
}
