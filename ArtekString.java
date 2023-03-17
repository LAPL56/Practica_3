import java.util.Random;
public class ArtekString {
    public static String UpperName(String name){
        String mayuscula = name.toUpperCase();
        System.out.println("UppperCase: "+mayuscula);
        return name.toUpperCase();
    }
    public static String LowerName(String name){
        String minuscula = name.toLowerCase();
        System.out.println("LowerCase: "+minuscula);
        return name.toLowerCase();
    }
    public static String[] SplitNames(String names, String regex) {
        String[] result = names.split(regex);
        return result;
    }
    public static String ReverseName(String name){
        String reversa = "";
        for(int i = name.length()-1; i>=0; i--){
            reversa += name.charAt(i);
        }
        System.out.println("Reversed: "+reversa);
        return reversa;
    }
    public static String DisorderName(String name){
        char[] charArray = name.toCharArray();
        Random rand = new Random();
        for (int i = charArray.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        String name_dis =  new String(charArray);
        System.out.println("Disordered: "+name_dis);
        return new String(charArray);
        }
    public static String ReplaceVowelsName(String name) {
        Random rand = new Random();
        String newString = "";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                int randNum = rand.nextInt(21) + 97; //genera un número aleatorio en el rango de códigos ASCII de letras consonantes minúsculas
                char newChar = (char) randNum;
                newString += newChar;
            } else {
                newString += c;
            }
        }
        System.out.println("Vowels replaced: "+newString);
        return newString;
    }
    public static String UpperLower(String name) {
        StringBuilder result = new StringBuilder(name.length());
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        System.out.println("UppperLower: "+result);
        return result.toString();
    }
    public static String LowerUpper(String name) {
        StringBuilder result = new StringBuilder(name.length());
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c);
            }
        }
        System.out.println("LowerUpper: "+result);
        return result.toString();
    }
}

