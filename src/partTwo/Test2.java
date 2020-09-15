package partTwo;

import java.util.LinkedList;
import java.util.List;

public class Test2 {

    /*
    	В строке вставить после каждого символа 'a' символ 'b'.
     */

    public static void main(String[] args) {

        String text = "One generalization often made about Americans is that they value their individualism quite high.";
        System.out.println("Текст до... " + text);
        System.out.print("Текст после ...  " + replaceChar(text));
    }

    public static String replaceChar(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> listCharsText = new LinkedList<>();
        char[] chars = text.toCharArray();
        char replace = 'b';
        for (int i = 0; i < chars.length; i++) {
            listCharsText.add(chars[i]);
        }
        for (int j = 0; j < listCharsText.size(); j++) {
            if (listCharsText.get(j) == 'a' || listCharsText.get(j) == 'A') {
                listCharsText.add(j + 1, replace);
            }
            stringBuilder.append(listCharsText.get(j));
        }
        String textAfter = stringBuilder.toString();
        return textAfter;
    }
}
