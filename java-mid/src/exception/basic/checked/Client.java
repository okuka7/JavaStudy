package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {
        //throws는 던지는 것이다.
        //문제 상황
        throw new MyCheckedException("ex");
    }

}
