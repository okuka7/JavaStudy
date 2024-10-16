package nested.inner.ex2;



public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }


    public void start(){
        engine.Start();
        System.out.println(model + "시작 완료");
    }

    private class Engine {
        //private Car car; 이미 안에 있기 때문에 car에 대한 정보가 없어도 된다.
        public void Start(){
            System.out.println("충전 레벨 확인 : " + chargeLevel); // 내부 클래스 이기때문에 바로 접근 가능합니다.
            System.out.println(model + "의 엔진을 구동 합니다.");
            //내부 클래스는 밖의 인스턴스에 접근할 수 있다.
        }
    }

}
