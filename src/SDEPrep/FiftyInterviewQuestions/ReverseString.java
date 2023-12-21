package SDEPrep.FiftyInterviewQuestions;

//How do you reverse a string in Java?
public class ReverseString {

    public static void main(String[] args) {

        String s = "Tanmoy";
        char ch; String s1 = "";

        for(int i = 0; i<s.length();i++){
            ch = s.charAt(i);
            s1 = ch + s1;
        }

        System.out.println(s1);
    }
}
