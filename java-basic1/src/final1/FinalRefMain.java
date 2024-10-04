package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();//data 변수에 파이널을 건것이다.
        //이렇게 되면 참조값을 변경하지 못한다. 주소값

        //참조 대상의 값은 변경 가능
        data.value = 10; //value에 파이널 없어서 우선 바꿀수 있다.
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);


    }
}
