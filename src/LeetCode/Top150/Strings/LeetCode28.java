package LeetCode.Top150.Strings;

public class LeetCode28 {

    public static int strStr(String haystack, String needle) {

        String[] s = haystack.split(needle);
        System.out.println(s.length);
        if(s.length ==1)
            return -1;
        for(int i = 0 ; i< s.length; i++){
            if(s[i].equals(" "))
                return i;

        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println( strStr("sadbutsad","sad"));
    }
}
