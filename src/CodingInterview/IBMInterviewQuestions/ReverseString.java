package CodingInterview.IBMInterviewQuestions;

public class ReverseString {

    public static String reverseString(String str){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abcs sfasf fsafsf"));
    }
}
