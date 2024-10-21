package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        //입력 : 1 2 5 99

        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[99] = 99;
        System.out.println(Arrays.toString(inputArray));

        int searchValue = 5;
        //O(1)
        Integer result = inputArray[searchValue];
        System.out.println(result);

    }
}
