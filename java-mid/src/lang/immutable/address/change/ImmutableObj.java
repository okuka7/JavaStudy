package lang.immutable.address.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result); //새로운 객체를 생성해주고 그것을 넣어준다. 그것을 리턴해준다.
    }

    public int getValue() {
        return value;
    }
}
