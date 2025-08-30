public class Test {
    static int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        //method calling
        add2numbers();
        Test obj = new Test();
        obj.addnumbers();
        obj.addfnumbers();
    }
    //method defining
    //static method
    //method - no return
    static void add2numbers(){
        int res = a+b;
        System.out.println(res);
        return;
    };
    //non static method
    //method - with return
    int addnumbers(){
        int res = a+b;
        System.out.println(res);
        return res;
    };
    //non static method
    //method - with return
    float addfnumbers(){
        int res = a+b;
        System.out.println(res);
        return res;
    };
}