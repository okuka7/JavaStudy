package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;


    public Printer process(final int paramVar){

       final int loccalVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
        //final이라고 선언을 하지 않아도 사실상 파이널이다. 사실상 파이널

        class LocalPrinter implements Printer{
            int value = 0;
            //우리 눈에 보이지는 않지만 이 시점에서 localVar 와 paramVar 을 캡쳐해둔다.
            @Override
            public void print() {
                System.out.println(value);

                //인스턴스는 지역 변수보다 더 오래 살아 남는다.
                System.out.println(loccalVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        }
        //여기서 생성이 된다.
        LocalPrinter printer = new LocalPrinter();
        //localPrinter.print(); 여기서 실행하지 않고 Printer 인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuterV1 = new LocalOuterV3();
        Printer printer = localOuterV1.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
       Field[] fields = printer.getClass().getDeclaredFields();
       for(Field field : fields){
           System.out.println(field);
       }

    }

}
