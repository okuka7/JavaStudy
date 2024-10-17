package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
        integerBox.set(10);
        //integerBox.set("문자100"); Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get();//Integer 타입 반환(캐스팅 X)
        System.out.println(integer);

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("test");
        String string = stringBox.get();
        System.out.println(string);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(3.14);
        Double double1 = doubleBox.get();
        System.out.println(double1);

        //타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>(); //타입 생략

        //제네릭을 사용한 덕분에 코드 재사용과 타입 안정성이라는 두 마리 토끼를 모두 잡을 수 있었다.
        //제네릭의 핵심은 사용할 타입을 미리 결정하지 않는다는 점이다.
        //클래스 내부에서 사용하는 타입을 클래스 정의하는 시점에 결정하는 것이 아니라 실제 사용하는
        // 생성 시점에 타입을 결정하는 것이다.



    }
}
