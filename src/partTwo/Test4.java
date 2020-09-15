package partTwo;

public class Test4 {

    /*
    	С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
     */

    public static void main(String[] args) {

        String text = "информатика";
        String newText ="" +  text.charAt(7) + text.charAt(3) + text.charAt(4) + text.charAt(7);
        System.out.println(newText);
        String concatText = "".concat("т").concat("о").concat("р").concat("т");
        System.out.println("Concat - " + concatText);
    }
}
