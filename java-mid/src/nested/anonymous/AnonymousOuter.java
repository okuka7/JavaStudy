package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;
    public void process(int paramVar){
        int loccalVar = 1;

        Printer printer = new Printer(){
            // 익명 클래스에는 이름이 없다.
            //익명 클래스를 사용할 대는 상위클래스나 인터페이스가 필요하다.
            int value = 0;
            @Override
            public void print() {
                System.out.println(value);
                System.out.println(loccalVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        };
        printer.print();
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

}
