package nested.nested.ex2;

import nested.nested.ex1.NetworkMessage;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }
        public void print(){
            System.out.println(content);
        }
    }
    //외부에서 NetworkMessage 에 접근할 수 없다.
}