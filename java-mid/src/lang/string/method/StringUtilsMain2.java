package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "hello, Java";

        String format1 = String.format("num: #d,bool:#b,str:#s",num,bool,str);
        System.out.println(format1);

        //printf
        System.out.printf("숫자 : %.2f\n",10.1234);

        //matches 메서드
        String regex = "Hello, (java|World)";
        System.out.println("일치하는가>?"+ str.matches(regex));
        }

    }
}
