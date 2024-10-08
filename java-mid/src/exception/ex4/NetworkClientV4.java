package exception.ex4;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;
import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError){

        }
        //연결 성공
        System.out.println(address + "서버 연결 성성공");
    }


    public void send(String data) {
        if(sendError){

        }
        //전송 성공
        System.out.println(address + "서버에 전송 성공" +data);
    }
    public void disconnect(){
        System.out.println("서버 연결 해제");
    }
    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        };
        if(data.contains("error2")){
            sendError = true;
        }
    }
}


