package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println(Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println(Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println(Data3.count);

        //클래스에 직접 접근하는 것처럼 느껴진다.
        //static이 붙은 멤버 변수는 메서드 영역에서 관리한다.
        //생성자에는 count++코드가 있따. count는 static이 붙은 정적변수다.
        //정적변수는 인스터느 영역이 아니라 메서드 영역에서 관리한다.
        //그래서 count값이 하나 증가된다.

        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);
        //인스턴스를 통한 접근은 권장하지 않는다.

        //클래스를 통한 접근
        System.out.println(Data3.count);

    }
}
