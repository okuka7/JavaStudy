package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
        //안적어도 알아서 폭탄이 밖으로 나간다.
    }
}
