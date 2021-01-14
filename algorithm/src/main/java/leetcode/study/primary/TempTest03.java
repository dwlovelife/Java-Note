package leetcode.study.primary;


public class TempTest03 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean flag = isPalindrome(s);
        System.out.println(flag);
    }

    public static boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if(Character.toLowerCase(start) == Character.toLowerCase(end)){
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
