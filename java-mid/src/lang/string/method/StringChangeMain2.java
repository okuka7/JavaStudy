package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWirhSpaces = "    java Programming";

        System.out.println("소문자로 변환: " + strWirhSpaces.toLowerCase());
        System.out.println("대문자로 " + strWirhSpaces.toUpperCase());
        System.out.println("공백제거" + strWirhSpaces.trim());
        System.out.println("공백제거" + strWirhSpaces.strip());
        System.out.println("앞 공백제거" + strWirhSpaces.stripIndent());
        System.out.println("뒤 공백제거" + strWirhSpaces.stripTrailing());



        
    }
}
