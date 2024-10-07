package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;// 반복횟수 10억
        long startTime,endTime;

        //기본형 long사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i =0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println((endTime - startTime));

        //Wrapper long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i =0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println((endTime - startTime));
    }
    //결과 값이 5배 정도 차이가 난다.
}
