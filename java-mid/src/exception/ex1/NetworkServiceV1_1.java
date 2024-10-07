package exception.ex1;



import exception.ex1.NetworkClientV1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가
        client.connect();
        client.send(data);
        client.disconnect();
    }

}
