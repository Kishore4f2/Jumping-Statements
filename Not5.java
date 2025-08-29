public class Not5 {
    public static void main(String[] args) {
        //program to print the numbers which are not having digit '5'
        for(int i=1;i<=60;i++) {
            int num = i;
            while(num>0) {
                int digit = num%10;
                if(digit==5) break;
                num /= 10;
            }
            if(num==0) System.out.print(i+" ");
        }
    }
}