package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append("!");
        sb.append("!");
        System.out.println(sb);

        sb.insert(1,"java");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //StringBuilder -> String
        //투스트링을 이용해서 스트링으로 반환한다.
        String string = sb.toString();
        System.out.println(string);
    }
}
