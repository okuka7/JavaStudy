package poly.ex3;

public abstract class AbstractAnimal {
    public abstract void sound();
    //추상 메서드가 하나라도 있는 경우에는 추상 클래스로 선언 해야 한다.
    // 추상 메서드는 바디를 못가진다.

    public void move(){
        System.out.println("동물이 움직입니다.");
    }

    }
