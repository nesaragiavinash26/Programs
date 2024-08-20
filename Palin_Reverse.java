package programmingclass;

import java.util.Scanner;

public class Palin_Reverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Reverse ");
        int num = sc.nextInt();
        int res = reverse(num);
        System.out.println("Reverse of number " + num + " is " + res);
        System.out.println("------------------------------");
        boolean result = palin(num);
        if(result == true)
        {
            System.out.println("Entered Number " + num + " is Palindrome");
        }
        else System.out.println("Entered Number " + num + " is not a Palindrome");
    }

    static int reverse(int num)
    {
        int number = num;
        int rem = 0;
        int rev = 0;
        while(num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    static boolean palin(int num)
    {
        int number = num;
        int rem = 0;
        int rev = 0;
        while(num != 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == number)
        {
            return true;
        }
        else return false;
    }
}
