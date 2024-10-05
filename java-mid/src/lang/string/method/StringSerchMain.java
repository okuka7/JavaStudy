package lang.string.method;

public class StringSerchMain {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to java Word";
        System.out.println("문자열에 java가 포함되어 있는지" +str.contains("Java"));
        System.out.println("'Java'의 첫 번째 인덱스" + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'java'의 인덱스 " + str.indexOf("java",10));
        System.out.println("java의 마지막 인덱스"+ str.lastIndexOf("java"));
    }
}
