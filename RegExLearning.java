
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExLearning {

    public RegExLearning() {

        // the word to search for
        // second args (called flags) are not compulsory
        Pattern wordPattern = Pattern.compile("love", Pattern.CASE_INSENSITIVE);

        // the sentence to search from
        Matcher wordToMatch = wordPattern.matcher("I Love my family");

        // to validate search
        boolean matchFound = wordToMatch.find();

        if (matchFound) {
            System.out.println("word exist");
        } else {
            System.out.println("Word doesn't exist");
        }
    }
}
