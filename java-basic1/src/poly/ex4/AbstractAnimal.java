package poly.ex4;

public abstract class AbstractAnimal {
    //순수 추상 클래스
    public abstract void sound();
    //추상 메서드가 하나라도 있는 경우에는 추상 클래스로 선언 해야 한다.
    // 추상 메서드는 바디를 못가진다.
    //순수 추상 클래스는 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
    public abstract void move();

    }
