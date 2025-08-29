public class Res24 {
    public static void main(String[] args) {
        //program to print 1 to 5 multiplication tables
        //program to break the tables when result greater than or equal to 24
        int res = 0;
        for(int j=1;j<=5;j++) {
            int num = j;
            for(int i=1;i<=10;i++) {
                res = num*i;
                if(res>=24) break;
                System.out.println(num+" X "+i+" = "+num*i);
            }
            if(res>=24) break;
            System.out.println("____________");
        }
    }
}