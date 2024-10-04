package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); //스트링안에 바이트 밸류 값으로 비교하기 때문에 비교가 가능하다.

        String s3 = "hello"; //x003
        String s4 = "hello"; // 리터럴이 있으면 참조값을 안만든다.
        System.out.println("리터럴 비교 " + (s3 == s4)); //true가 나오는 이유는 : 자바가 실행되는 시점에 클래스에 문자열 리터럴이 있으면 리터럴 풀에 스트링 객ㅊ페를 미리 만들어둔다.
        System.out.println(s3.equals(s4));
        //문자열 풀 덕분애 같은 문자를 사용하는경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능 최적화를 할 수 있다.
    }
}
