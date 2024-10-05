package lang.string.builder;

public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        String string = sb.append("Hello").append("!").append("!")
                        .insert(4,"java")
                                .delete(1,3)
                                        .reverse()
                                                .toString();
        System.out.println(string);
        //메서드 체이닝 때문에 가능하다. 타입을 바꿀대까지 가능하다.
    }
}
