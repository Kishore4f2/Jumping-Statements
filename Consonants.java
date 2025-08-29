public class Consonants {
    public static void main(String[] args) {
        //program to print A to Z -> only consonants
        for(int i=65;i<=90;i++) {
            if((char)i == 'A' || (char)i == 'E' || (char)i == 'I' || (char)i == 'O' || (char)i == 'U'){
                continue;
            }
                else {
                    System.out.print((char)i+" ");
            }
        }
    }
}