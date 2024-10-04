package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >=100){
            System.out.println("최대 음량입니다.");
        }else{
            volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDowm(){
        volume -= 10;
        System.out.println("볼륨을 10 감소합니다.");
    }

    void showVolume(){
        System.out.println("현재음량"+volume);
    }
}
