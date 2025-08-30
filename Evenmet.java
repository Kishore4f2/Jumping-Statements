public class Evenmet {
    public static void main(String[] args) {
        //method calling
        printEvennumbers(21,30);
        printEvennumbers(341,350);
    }
    //defining the method
    static void printEvennumbers(int start,int end){
        for(int i=start;i<=end;i++){
            if(i%2==0) System.out.print(i+" ");
        }
    };
}