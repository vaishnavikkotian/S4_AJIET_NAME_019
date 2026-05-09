import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = 10; // jar capacity
        int K = 5;  // minimum candies

        int candies = N;

        int input = sc.nextInt();

        // invalid input
        if(input > candies || input <= 0)
        {
            System.out.println("INVALID INPUT");
        }
        else
        {
            candies = candies - input;

            // refill jar if candies <= K
            if(candies <= K)
            {
                candies = N;
            }

            System.out.println("Number of Candies Sold:" + input);
            System.out.println("Number of Candies available:" + candies);
        }
    }
}
