package partTwo;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    /*
    	Проверить, является ли заданное слово палиндромом.
     */

    public static void main(String[] args) {

        List<String> wordList = new ArrayList<>();

        wordList.add("Madam, I'm Adam!");
        wordList.add("Топот");
        wordList.add("Список");
        wordList.add("Mашина");
        wordList.add("Доммод");
        wordList.add("Car");
        wordList.add("Ecare");
        wordList.add("Ешь немытого ты меньше");
        wordList.add("Level");

        System.out.println("Вывод всех слов..." + wordList.toString());
        wordPalindrome(wordList);

    }

    public static void wordPalindrome(List<String> listWords) {
        for (int i = 0; i < listWords.size(); i++){
            String text = listWords.get(i);
            StringBuilder stringBuilder = new StringBuilder(text.replaceAll(" ", ""));
            stringBuilder.reverse();
            String invertedText = stringBuilder.toString();
            String textEquals = listWords.get(i).replaceAll(" ", "");
            if(textEquals.equalsIgnoreCase(invertedText)){
                System.out.println("Слово палиндром: " + listWords.get(i));
            }
        }
    }
}
