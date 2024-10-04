package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println(data1.count);

        Data1 data2 = new Data1("B");
        System.out.println(data2.count);

        Data1 data3 = new Data1("A");
        System.out.println(data3.count);

        //객체를 생성할때마다 인스턴스는 새로 만들어지기 때문에 1
        //인스턴스에 사용되는 멤버 변수 count 값은 인스턴스끼리 서로 공유되지 않는다.
        //따라서 원하는 답을 구할 수 없다.
        //이 문제를 해결하려면 변수를 서로 공유해야 한다.
    }
}
