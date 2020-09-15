package partTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test9 {

    /*
        Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
     Учитывать только английские буквы.
     */

    public static void main(String[] args) {
        String text = "Today a new format. This world is inside. Сейчас";
        System.out.println(text);
        countUppercase(text);
    }

    public static void countUppercase(String text) {
        int uppercase = 0;    // Прописная буква (счётчик)
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            uppercase++;
        }
        System.out.println("Количество прописных букв - " + uppercase);
        countLowercase(text);
    }

    public static void countLowercase(String text) {
        int lowercase = 0;  // Строчная буква (счётчик)
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            lowercase++;
        }
        System.out.println("Количество строчных букв - " + lowercase);
    }

    /*
    // Метод определяет количество строчных и прописных букв вне зависимсти от языка
     public static void countLowerAndUppercase(String text) {
        char[] chars = text.toCharArray();
        int lowercase = 0;  // Строчная буква (счётчик)
        int uppercase = 0;    // Прописная буква (счётчик)

        for(int i = 0; i < chars.length; i++){
            if(Character.isUpperCase(chars[i])){
                lowercase++;
            }else if(Character.isLowerCase(chars[i])){
                uppercase++;
            }
        }
        System.out.println("Количество строчных букв - " + lowercase);
        System.out.println("Количество прописных букв - " + uppercase);
    }
     */
}
