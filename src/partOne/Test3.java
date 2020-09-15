package partOne;

public class Test3 {

    /*
    	В строке найти количество цифр.
     */

    public static void main(String[] args) {
        String text = "Today is 10.02. A good day";
        System.out.println(text);
        System.out.println("Количество цифр в строке - " + searchNumbers(text));

    }

    public static int searchNumbers(String text) {
        int countNumbers = 0;
        char[] chars = text.toCharArray();
        for(int i = 0; i < chars.length; i++){
            if(Character.isDigit(chars[i])){
                countNumbers++;
            }
        }
        return countNumbers;
    }
}
