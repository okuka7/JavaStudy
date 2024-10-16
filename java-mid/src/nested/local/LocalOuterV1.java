package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;
    public void process(int paramVar){
        int loccalVar = 1;

        class LocalPrinter{
            int value = 0;

            public void printData(){
                System.out.println(value);
                System.out.println(loccalVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        }
        //여기서 생성이 된다.
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }

}