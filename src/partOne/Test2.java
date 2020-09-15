package partOne;

public class Test2 {

    /*
    	Замените в строке все вхождения 'word' на 'letter'
     */

    public static void main(String[] args) {

        String text = "world, word, text, divide, walk, window, word.";
        System.out.println("Text до замены: " + text);

        String word = "word";
        String wordReplace = "letter";

        String newText = wordReplace(text, word, wordReplace);
        System.out.print("Text после замены: ");
        System.out.println(newText);


    }

    public static String wordReplace(String text, String word, String wordReplace) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = text.replaceAll("[,.?!]", "").split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(word)) {
                words[i] = wordReplace;
                stringBuilder.append(words[i]);
            } else {
                stringBuilder.append(words[i]);
            }

            if (i == words.length - 1) {
                stringBuilder.append(".");
            } else {
                stringBuilder.append(", ");
            }
        }
    return stringBuilder.toString();
    }
}
