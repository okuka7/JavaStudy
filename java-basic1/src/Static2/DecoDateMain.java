package Static2;

public class DecoDateMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴트 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴트 호출 2");
        DecoData data2 = new DecoData();
        data1.instanceCall();
    }
}
