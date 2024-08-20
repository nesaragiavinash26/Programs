package questions;
import java.util.Scanner;
import java.util.*;
public class Permu_Combu
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter value for n ");
        int n = sc.nextInt();
        System.out.println("Enter value for r ");
        int r = sc.nextInt();

        int res1 = permutation(n, r);
        int res2 = combination(n, r);
        System.out.println("Permutation of n : " + n + " and r : " + r + " is " + res1);
        System.out.println("Combination of n : " + n + " and r : " + r + " is " + res2);
    }

    static int permutation(int n, int r)
    {
        int upper = fact(n);
        int lower = fact(n-r);
        return (upper/lower);
    }

    static int combination(int n, int r)
    {
        int upper = fact(n);
        int lower = fact(n-r);
        int last = fact(r);
        int result = (upper) / (lower * last);
        return result;
    }

    static int fact(int n)
    {
        int factorial = 1;
        for(int i = n; i >=1; i--)
        {
            factorial = factorial * i;
        }
        return factorial;
    }

}
