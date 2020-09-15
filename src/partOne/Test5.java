package partOne;

public class Test5 {

    /*
    	Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
     */

    public static void main(String[] args) {
        String text = "   Today is  2020.02.10.   A good day.  ";
        System.out.println("До...... " + text);;
        System.out.println("После... " + text.trim().replaceAll("\\s+", " "));
    }
}
