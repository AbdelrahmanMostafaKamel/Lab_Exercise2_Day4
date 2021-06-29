public class CheckString {
    public static boolean isStringOnlyAlphabets(String s1){
        return((s1!=null)&&(s1!=" "&&s1.chars().allMatch(Character::isLetter)));
    }
}
