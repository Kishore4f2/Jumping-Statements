class Demo1 {
    
    static String name = "10K Coders";
    static String address = "Hyderabad";
    
    String StudentName;
    int StudentMarks;
    
    static void instituteDet() {
        System.out.println("--Details of Institute--");
        System.out.println(name+" is located in "+address);
        System.out.println();
    }
    
    static void instituteRules() {
        System.out.println("--Rules--");
        System.out.println("1.Maintain min 90% attendance");
        System.out.println("2.Give mock interviews");
        System.out.println("3.After completion of course maintain min 80% attendance");
        System.out.println();
    }
    
    void addNewStudent(String name) {
        StudentName = name;
        System.out.println(StudentName+" added into records");
        System.out.println();
    }
    
    void updateMarks(int marks) {
        StudentMarks = marks;
        System.out.println(StudentName+" got "+StudentMarks+" in intermediate");
        System.out.println();
    }
}

public class Demo12 {
    public static void main(String[] args) {
        Demo1.instituteDet();
        Demo1.instituteRules();
        
        Demo1 s1 = new Demo1();
        s1.addNewStudent("Panda");
        s1.updateMarks(899);
    }
}