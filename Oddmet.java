public class Oddmet {
    public static void main(String[] args) {
        //method calling
        printOddnumbers(1,10);
        printOddnumbers(11,20);
    }
        //method defining
        static void printOddnumbers(int start,int end){
            for(int i=start;i<=end;i++){
                if(i%2!=0) System.out.print(i+" ");
            }
        };
}