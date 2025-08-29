public class Pal {
    public static void main(String[] args) {
        //program to print the numbers which are not having digit '5'
        //wap to check given palindrome or not.
        int num = 12321;
        int rev = 0;
        int temp = num;
        while(temp>0) {
            int digit = temp%10;
            rev = rev*10+digit;
            temp /= 10;
        }
        if(num==rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}