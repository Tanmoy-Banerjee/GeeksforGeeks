package SDEPrep.FiftyInterviewQuestions;

//How do you check whether a string is a palindrome in Java
public class Pallindrome {

    public static void main(String[] args) {

        String s = "Madam";

        if(checkPallindrome(s))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");

    }

    public static boolean checkPallindrome(String s){

        s = s.toLowerCase();
        if(s.equals(returnPallindrome(s))){
            return true;
        }else{
            return false;
        }

    }

    public static String returnPallindrome(String s){

        s = s.toLowerCase();
        String s1 = "";
        for (int i = 0 ; i< s.length(); i++){
              char ch = s.charAt(i);
               s1 = ch+s1;
        }

        return s1;
    }
}
