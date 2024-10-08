package exception.ex4;




import exception.ex3.NetworkServiceV3_1;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args){
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("전송할 문자 ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                break;
            }
            try{
                networkService.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");
        //예외를 세분화해서 처리 했다.

    }
    //공통 예외 처리
    private static void exceptionHandler(Exception e){
        //공통 처리
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 기버깅 메세지");
        e.printStackTrace(System.out);//스택 트레이스 출력
        //e.printStackTrace(System.err); //빨강색으로 출력하게 된다. 흐름이 달라서 잘 안쓴다.
        //일반적으로는 e.printStackTrace 이방법을 쓴다. 실무애서는 sysout을 쓰지 않는다.

        //필요하면 예외 별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx){
            System.out.println("[전송 오류]" +sendEx.getSendData());
        }
    }

}
