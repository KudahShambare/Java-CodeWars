import java.util.*;

public class ReverseStrings {
    public static String reverseWords(final String original) {
        //Spit the original string that was passed as a parameter into any array of words
        String[] words = original.split(" ");
//Create an ArrayList to store reversed words
        ArrayList<StringBuilder> reversedWords = new ArrayList<StringBuilder>();
        //Loop through the words array , in  order to reverse all of them
        for (String a : words) {
            //Use a StringBuilder inorder to manipulate string because the "Strings" data type is immutable
            StringBuilder change = new StringBuilder(a);

            reversedWords.add(change.reverse());
        }
        String newValue = "";
        for (StringBuilder b : reversedWords) {
            String addMe = " " + b.toString();
            newValue += addMe;
        }
        return newValue;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a string that you want every letter of it to be reversed: ");
        try  {
            Scanner scan = new Scanner(System.in);
            String reverseMyWords=scan.nextLine();
            System.out.println(reverseWords(reverseMyWords));
            scan.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
