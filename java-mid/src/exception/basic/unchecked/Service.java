package exception.basic.unchecked;

/**
 * UnChecked예외는
 * 예외를 잡거나,던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {
    Client client = new Client();

    /**
     * 필요한경우 예외를 잡아서 처리할 수 있다.
     */
    public void callCatch(){
        try {
            client.call();
        } catch(MyUncheckedException e){
            System.out.println("예외처리 " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 예외를 잡지 않아도 된다. 자연스럽게 상위로 넘어간다.
     * 체크 예외와 다르게 throw 예외 선언을 하지 않아도 됩니다.
     */
    public void callThrow(){
        client.call();
    }
}
