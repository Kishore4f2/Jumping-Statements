public class Div5 {
    public static void main(String[] args) {
        //program to find the largest number in the range
        //which is divisible by 5 and 11
        int last = 0;
        for(int i=1;i<=500;i++) {
            if(i%5==0 && i%11==0) {
                if(last<i) {
                    last = i;
                }
            }
        }
        System.out.print(last);
    }
}