package nested;

public class ShadowingMain {
    public int value = 1;
    class  Inner{
        public int value = 2;
        void go(){
            int value = 3;
            System.out.println("value" + value); //3
            System.out.println(this.value);//나의 인스턴스의 값 2
            System.out.println(ShadowingMain.this.value); //바깥클래스명.디스.밸류 1
            //프로그래밍에서 우선순위는 대부분 더 가깝거나, 더 구체적인 것이 우선권을 가진다.
            //이렇게 다른 변수들을 가려서 보이지 않ㄴ게 하는것을 섀도잉이라고 한다.
        }
    }
    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        System.out.println(inner.value);
    }
}
