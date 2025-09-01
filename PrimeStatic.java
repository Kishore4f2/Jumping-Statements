public class PrimeStatic {
    public static void main(String[] args) {
        printisPrime(1,20);
        printisPrime(30,50);
    }
    static void printisPrime(int start, int end) {
        for(int i=start;i<end;i++) {
            int count = 0;
            for(int j=1;j<=i;j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i+" is prime");
            }
        }
    }
}

