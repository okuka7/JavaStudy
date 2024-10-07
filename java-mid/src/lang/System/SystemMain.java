package lang.System;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간을 가져온다.
        long startTime = System.currentTimeMillis();

        //현재 시간을 가져온다.
        long currentNano = System.nanoTime();
        System.out.println(currentNano);

        //환경 변수를 읽는다.
        System.out.println("getenv =" + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        //배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        //자바가 하는게 아니라 자바가 운영체제에게 넘겨서 하게 된다.

        //배열 출력
        System.out.println(copiedArray); //참조 값이 나온다.
        System.out.println(Arrays.toString(copiedArray));//String으로 나온다.

        //루프로 돌려서 하는게 아니라 통채로 읽어서 한번에 카피를 하기 때문에 속도가 빠르다. 두배이상 빠르다.

        //프로그램 종료
        //사용을 권장하지 않는다.
        System.exit(0);


    }
}
