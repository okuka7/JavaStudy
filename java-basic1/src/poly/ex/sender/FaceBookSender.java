package poly.ex.sender;

public class FaceBookSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("facebook메세지를 발송합니다."+message);
    }
}
