package exception.basic.checked;

/**
 * Exception을 상속 받은 예외는 체크 예외가 된다.
 * 체크 예외는 잡아서 직접 처리하거나, 또는 밖으로 던지거나 둘중 하나를 개발자가 직접 명시적으로 처리해야 한다.
 * 부모타입을 던져도 된다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
