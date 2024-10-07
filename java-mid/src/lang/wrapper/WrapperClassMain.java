package lang.wrapper;

import java.util.stream.DoubleStream;

public class WrapperClassMain {
    public static void main(String[] args) {
        //박싱이라고 한다.
        Integer newInteger = new Integer(10); //앞으로 이거 사라질거니까 쓰지말라는 뜻으로 빨간줄뜬다. 미래에 삭제 예정 valueOf()사용
        Integer integerObj = Integer.valueOf(10); //128 - 127 자주 사용하는 숫자 값 재사용, 불변 성능 최적화
        Long longObj = Long.valueOf(10);
        Double doubleObj = Double.valueOf(10);

        System.out.println(integerObj);
        System.out.println(newInteger);

        System.out.println("내부 값 읽기"); //언박싱이ㅏ고 한다.
        int intValue = integerObj.intValue();
        System.out.println(intValue);
        long longValue = longObj.longValue();
        System.out.println(longValue);
        double doubleValue = doubleObj.doubleValue();
        System.out.println(doubleValue);

        System.out.println("비교");
        System.out.println(newInteger == integerObj);// false 다른 참조값을 참조하기 때문에
        System.out.println("eqauls" + (newInteger == integerObj)); //ture
    }
}
