package user;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public interface Validator {

    default boolean isValid(String userMail) {

        final String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        try {
            Pattern regexPattern = Pattern.compile(emailRegex);
            if (userMail == null)
                return false;
            return regexPattern.matcher(userMail).matches();
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
