import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
