package partTwo;

public class Test6 {

    /*
    	Из заданной строки получить новую, повторив каждый символ дважды
     */

    public static void main(String[] args) {
        String text = "Today a new format:";
        System.out.println("Текст до...... " + text);
        System.out.println("Текст после... " + stringDuplicateChar(text));
    }

    public static String stringDuplicateChar(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++){
            stringBuilder.append(String.valueOf(chars[i]) + String.valueOf(chars[i]));
        }
        return stringBuilder.toString();
    }
}
