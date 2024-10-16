package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;
    public void process(int paramVar){
        int loccalVar = 1;

        class LocalPrinter implements Printer{
            int value = 0;
            @Override
            public void print() {
                System.out.println(value);
                System.out.println(loccalVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        }
        //여기서 생성이 된다.
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuterV1 = new LocalOuterV2();
        localOuterV1.process(2);
    }

}
