package poly.ex.sender;

public class EmailSender implements Sender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
