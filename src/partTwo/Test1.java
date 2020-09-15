package partTwo;

public class Test1 {

    /*
    	Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
     */

    public static void main(String[] args) {

        String text = "Where does she live  today       ?  If briefly   - there.";
        System.out.println(text);
        System.out.println("Максимальное количество пробелов - " + searchSpace(text));
    }

    public static int searchSpace(String text) {
        char[] charArray = text.toCharArray();
        char step = ' ';
        int countSpace = 0;
        int countT = 0;     // заглушка... Необходимо для промежуточного счёта
        int countReset = 0;     // если следующий символ не пробел, то счёт сбрасывается

        for(int i = 0; i < charArray.length; i++) {
            if (charArray[i] == step) {
                if (((i + 1) < charArray.length) && charArray[i] == charArray[i + 1]) {
                    countT++;
                    countReset++;
                }else countReset = 0;
            }
            if(!(countReset == 0)) {
                if (countSpace < countT) {
                    countSpace = countT;
                }
            }
            if(countReset == 0) {
                countT = 0;
            }
        }
        countSpace = countSpace + 1;
        return countSpace;
    }
}
