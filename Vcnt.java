public class Vcnt {
    public static void main(String[] args) {
        String s = "Kishore";
        int Vcount = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                Vcount++;
            }
            else {
                continue;
            }
            System.out.println(Vcount+"."+s.charAt(i));
        }
    }
}