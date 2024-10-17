package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); // 다이아몬드를 삭제하고 만들수 있다. 타입안정선이 위험하다.
        //GenericBox<Object> integerBox = new GenericBox<>()  이것과 같은 코드이다. 다이아 모내드 사용권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println(result);

        //옛날 자바버전때문에 존재하지만 결론적으로 로우 타입은 사용하면 안된다.
    }
}
