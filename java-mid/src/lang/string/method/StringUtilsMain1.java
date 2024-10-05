package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "hello, Java";

        //valueOf Mwthod
        String numString = String.valueOf(num);
        System.out.println(numString);
        String boolString = String.valueOf(bool);
        System.out.println(boolString);
        String objString = String.valueOf(obj);
        System.out.println(objString);
        //문자 + x -> 문자
        String numString2 = "" +  num;
        System.out.println(" "+ numString2);
        //toCharArray
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 " +strCharArray);
        for(char c : strCharArray){
            System.out.print(c);
        }

    }
}
