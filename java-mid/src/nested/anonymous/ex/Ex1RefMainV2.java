package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process process){
        //Process process 매개변수를 통해 인스턴스를 전달할 수 있다.
        System.out.println("시스템 시작");

        //코드 조각 시작
        //여기서 코드 조각을 실행한다.
        //인스턴스를 호출
        process.run();

        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        class Dice implements Process {
            @Override
            public void run(){
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println(randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run(){
                for(int i =0;i<3;i++){
                    System.out.println(i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();
        System.out.println("hello 실행");
        hello(dice);
        hello(sum);
    }
}
