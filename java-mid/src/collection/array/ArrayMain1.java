package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        //index 입력 : 0(1) 빅오 포기법
        System.out.println("==index 입력 0(1) ==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 변경 : 0(1)==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("==index 조회 : 0(1)==");
        System.out.println("arr[2" + arr[2]);

        System.out.println("==배열 검색: 0(n)==");
        System.out.println(Arrays.toString(arr));
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+arr[i]);
            if(arr[i] == value) {
                System.out.println(value + "참음");
                break;
            }

        }
    //배열의 크기가 n이면 연산도 n만큼 필요하다.
    }
}
