package lang.object.toString;

public class ToStringMain {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();
        //toString반환값 출력
        System.out.println(string);

        //object 직접출력
        System.out.println(object);
    }
}
