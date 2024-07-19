package LeetCode.Top150.Strings;
//
//125. Valid Palindrome
//        Easy
//        Topics
//        Companies
//        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//        Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: s = "A man, a plan, a canal: Panama"
//        Output: true
//        Explanation: "amanaplanacanalpanama" is a palindrome.
//        Example 2:
//
//        Input: s = "race a car"
//        Output: false
//        Explanation: "raceacar" is not a palindrome.
//        Example 3:
//
//        Input: s = " "
//        Output: true
//        Explanation: s is an empty string "" after removing non-alphanumeric characters.
//        Since an empty string reads the same forward and backward, it is a palindrome.
//
//
//        Constraints:
//
//        1 <= s.length <= 2 * 105
//        s consists only of printable ASCII characters.
public class LeetCode125 {

    public static boolean isPalindrome(String s) {

        String s1 = "";
        s = s.replaceAll("\\s","");
        for(int i = 0;i<s.length(); i++){
            char ch = s.charAt(i);

//            if(ch != ',' && ch != ':'&& ch != '@'&& ch != '#' && ch != '$' && ch != '*'&& ch != '&'&& ch != 0 && ch != 1 && ch != 2 && ch != 3 && ch != 4 && ch != 5 && ch != 6 && ch != 7 && ch != 8 && ch != 9){
//             //   System.out.println("Enters here with "+ch);
//                s1 = s1 + ch;
//            }

            if(Character.isLetterOrDigit(ch)){
                s1 = s1 + ch;
            }

        }
        s1 = s1.toLowerCase();
        System.out.println(s1);
        String s2 = "";
        for(int i = 0 ; i< s1.length(); i++ ){
            char ch = s1.charAt(i);
            s2 = ch + s2;
        }

        System.out.println(s2);

        if(s1.equals(s2))
            return true;
        else if (s1.equals(""))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(" "));
    }
}
