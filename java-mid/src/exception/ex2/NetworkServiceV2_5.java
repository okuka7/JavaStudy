package exception.ex2;


public class NetworkServiceV2_5 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("오류 코드" + e.getErrorCode() + "메세지 " +e.getMessage());
        }finally {
            client.disconnect();
            //위에서 터져도 일단 파이널리고 들렸다가 나간다.

        }
    }

}
