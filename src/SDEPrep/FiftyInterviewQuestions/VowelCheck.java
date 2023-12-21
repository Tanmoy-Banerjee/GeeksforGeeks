package SDEPrep.FiftyInterviewQuestions;

//Write a Java program to check if a vowel is present in a string.
public class VowelCheck {

    public static void main(String[] args) {
        String s = "tnmy";

        s = s.toLowerCase();
        int check = 0;
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch =='a'|| ch=='e'||ch =='i'|| ch=='o'||ch=='u'){
                check++;
                break;
            }
        }

        if(check>0){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
