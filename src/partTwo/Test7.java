package partTwo;

import java.util.HashSet;
import java.util.Set;

public class Test7 {

    /*
    	Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было
    введено "abc cde def", то должно быть выведено "abcdef".
     */

    public static void main(String[] args) {

        String text = "abccdedef";

        System.out.println("Текст до условия................ " + text);
        System.out.print("Текст после выполнения условия.... " + deleteDuplicateChar(text));
    }

    public static String deleteDuplicateChar(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> set = new HashSet<>();
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            set.add(chars[i]);
        }

        for(Character character : set){
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }
}
