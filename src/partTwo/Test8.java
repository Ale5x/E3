package partTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test8 {

    /*
    	Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран.
    Случай, когда самых длинных слов может быть несколько, не обрабатывать.

     */

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        try {
            String text = reader.readLine();
            System.out.println("Длинное слово в тексте - " + maxString(text));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String maxString(String text){
        String words = text.replaceAll("[\\p{Punct}\\r\\n]", "");
        String[] wordArray = words.split(" ");
        String maxWord = wordArray[0];
        int maxCount = 0;

        for(int i = 1;i < wordArray.length; i++){
            if(maxWord.length() < wordArray[i].length())
                maxWord = wordArray[i];
        }
        for(int i = 0; i < wordArray.length; i++) {
            if(maxWord.length() == wordArray[i].length()) {
                maxCount++;
            }
        }
        if (maxCount > 1) {
        return "\"В данной строке несколько длинных слов\"";
        }
        return maxWord;
    }
}
