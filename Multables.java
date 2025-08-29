public class Multables {
    public static void main(String[] args) {
        //program to print 1 to 5 multiplication tables
        for(int j=1;j<=5;j++) {
            int num = j;
            for(int i=1;i<=10;i++) {
                System.out.println(num+" X "+i+" = "+num*i);
            }
            System.out.println(".............");
        }
    }
}