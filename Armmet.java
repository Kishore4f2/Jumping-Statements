public class Armmet {
    public static void main(String[] args) {
        //method calling
        armstrong(153);
        armstrong(8208);
        
    }
    //defining a method
    static void armstrong(int num){
        int armstrong = num;
        int temp1 = num;
        int temp2 = temp1;
        int count = 0;
        
        while(temp1>0){
            count++;
            temp1 /= 10;
        }
        int sum = 0;
        while(temp2>0){
           int digit = temp2%10;
           int power = 1;
           for(int i=1;i<=count;i++){
               power = power*digit;
           }
           sum += power;
           temp2 /= 10;
        }
        if(num==sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    };
}