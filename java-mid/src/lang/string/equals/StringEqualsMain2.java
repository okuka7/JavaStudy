package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(isSame(s1,s2));

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(isSame(s3,s4));

    }
    private static boolean isSame(String x,String y ){
        //return x == y; 늘 뭐가 들어올지 모르기깨문에 equals를 쓴다.
        return x.equals(y);
    }
}
