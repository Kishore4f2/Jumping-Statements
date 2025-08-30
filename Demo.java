public class Demo {
    static int a = 20;
    int b = 10;
    public static void main(String[] args) {
        System.out.println(a);
        Demo obj = new Demo();
        System.out.println(obj.b);
        //method calling
        method1();
        obj.method2();
    }
    //static method defining
    static void method1(){
        System.out.println(a);
        Demo obj = new Demo();
        System.out.println(obj.b);
        return;
    };
    //non static method defining
    void method2(){
        System.out.println(a);
        System.out.println(b);
        return;
    };
}