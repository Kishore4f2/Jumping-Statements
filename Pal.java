import java.util.*;
public class Pal {
    public static void main(String[] args) {
        //program to print the numbers which are not having digit '5'
        //wap to check given palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
        while(temp>0) {
            int digit = temp%10;
            rev = rev*10+digit;
            temp /= 10;
        }
        if(num==rev) System.out.println(num+" is a Palindrome");
        else System.out.println(num+" is Not a Palindrome");
    }
}