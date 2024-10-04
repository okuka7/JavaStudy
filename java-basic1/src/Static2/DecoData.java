package Static2;

public class DecoData {
    private  int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 접근
        //static같은 붕어빵 틀에 있기 대문에 호출할 수 있다.
        staticMethod();//정적 메서드 접근
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 밸류에 접근
        instanceMethod(); //인스턴스 메소드 접근

        staticValue++;//정적 변수 접근
        staticMethod();//정적 메서드 접근
    }
    private void instanceMethod(){
        System.out.println(instanceValue);
    }
    private static void staticMethod(){
        System.out.println(staticValue);
    }

    //static은 static에만 접근할 수 잇다
    //instance는 모든 곳에 접근 할 수 있다.
}
