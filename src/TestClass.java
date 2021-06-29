public class TestClass {
    public static void main(String[] args){
        String s1="Ahmed";
        String s2="3wael";
        boolean answer=CheckString.isStringOnlyAlphabets(s1);
        if(answer) {
            System.out.println("String all alphabets");
        }
        else{
            System.out.println("String is not all alphabets");
        }
        boolean answer1=CheckString.isStringOnlyAlphabets(s2);
        if(answer1) {
            System.out.println("String all alphabets");
        }
        else{
            System.out.println("String is not all alphabets");
        }
    }
}
