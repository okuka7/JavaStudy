package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; //스태틱 파이널이 붙으면 대문자로 써줘야 한다.
    final int value = 10;

    public FieldInit() {
       // this value = value;
        //파이널이 먼저 들어가면 생성자로 값을 넣지 못한다.
    }
}
