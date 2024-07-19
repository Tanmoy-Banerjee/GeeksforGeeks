package CodingInterview.IBMInterviewQuestions;

public class CheckPallindrome {

    public static boolean isPallindrome(String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);

        return str.equals(stringBuilder.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPallindrome("abba abbac"));
    }
}
