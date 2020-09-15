package partOne;

public class Test1 {

    /*
    	Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
     */
    public static void main(String[] args) {

        String[] camelCase = {"camelCase", "textOne", "mamaMia"};
        String[] newText = new String[camelCase.length];

        StringBuilder stringBuilder;
        for(int i = 0; i < camelCase.length; i++) {
            char[] charsText = camelCase[i].toCharArray();
            stringBuilder = new StringBuilder();
            for(int j = 0; j < charsText.length; j++) {
                String chars = Character.toString(charsText[j]);

                if(chars.equals(chars.toUpperCase())) {
                    stringBuilder.append("_");
                    stringBuilder.append(Character.toLowerCase(charsText[j]));
                }else {
                    stringBuilder.append(chars);
                }
            }
            newText[i] = stringBuilder.toString();
        }
        for(String string : newText) {
            System.out.println(string);
        }
    }
}
