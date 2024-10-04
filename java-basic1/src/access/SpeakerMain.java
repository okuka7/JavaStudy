package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.volumeDowm();
        speaker.showVolume();

        //필드에 직접 접근하기
        System.out.println("voluem 필드 직접 접근 수정");
        //speaker.volume = 200; private로 바꿔서 접근이 제한되었다.
        speaker.showVolume();


    }
}
