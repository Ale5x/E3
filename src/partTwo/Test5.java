package partTwo;

public class Test5 {

    /*
    	Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
     */

    public static void main(String[] args) {

        String text = "Создает вторую строку, но пересортированную в обратном порядке. Аргентина.";
        System.out.println("Текст - " + text);
        System.out.println("Количество буквы \"а\" в строке - " + countChar(text));
    }

    public static int countChar(String text) {
        int count = 0;
        char[] charsText = text.toCharArray();
        for(int i = 0; i < charsText.length; i++){
            if(charsText[i] == 'а' || charsText[i] == 'А'){
                count++;
            }
        }
        return count;
    }
}
