package SDEPrep.FiftyInterviewQuestions;

//How do you remove spaces from a string in Java?

public class RemoveSpaces {

    public static void main(String[] args) {

        String s = "The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays. If you are sorting a primitive array in the natural order, then you can use the Arrays.sort() method, as shown in the following example:";

        System.out.println(s.replaceAll(" ", ""));
    }
}
