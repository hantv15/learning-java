import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit w3schools");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        // Find one character from the options between the brackets
        Pattern pattern2 = Pattern.compile("[abc]", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher("Visit w3schools");
        boolean matchFound2 = matcher2.find();
        if (matchFound2) {
            System.out.println("Match found abc");
        } else {
            System.out.println("Match not found abc");
        }
    }
}