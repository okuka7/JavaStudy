package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();//여기서 해결을 못하고 던졌기 때문에 Main메소드 밖으로 던져서 에러가 터진다.
        System.out.println("정상종료");
    }
}
