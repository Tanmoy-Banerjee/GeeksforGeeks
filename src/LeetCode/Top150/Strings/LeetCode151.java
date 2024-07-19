package LeetCode.Top150.Strings;

public class LeetCode151 {

    public static String reverseWords(String s) {

        s = s.replaceAll("\\s+"," ");
        String[] words = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length-1; i>=0; i--){
            stringBuilder.append(words[i]);
            stringBuilder.append(" ");
       }

        return stringBuilder.toString().trim();

    }

    public static void main(String[] args) {

        String s = "the sky      is blue";

        reverseWords(s);
    }
}
