package partTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test10 {

    /*
       Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
    вопросительным знаком. Определить количество предложений в строке X.
     */

    public static void main(String[] args) {

        String text = "This world is crazy. How much will he have to live? No one knows!";
        System.out.println("Количество предложений - " + countSentence(text));
    }

    public static int countSentence(String text) {
        int cont = 0;
        Pattern pattern = Pattern.compile("[?,.!]");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            cont++;
        }
        return cont;
    }
}
