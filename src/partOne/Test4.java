package partOne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

    /*
    	В строке найти количество чисел.
     */

    public static void main(String[] args) {

        String text = "Today is 2020.02.10. A good day";
        System.out.println(text);
        System.out.println("Сумма чисел в строке - " + searchNumbers(text));
    }

    public static int searchNumbers(String text) {
        final Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        int countNumbers = 0;

        while (matcher.find()) {
            countNumbers++;
        }
        return countNumbers;
    }
}
