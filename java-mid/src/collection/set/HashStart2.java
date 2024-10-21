package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력 : 1 5 4 3
        //[null,1,null,3,4,5,null,null,null]
        Integer[] inputArray = new Integer[10];
        inputArray[1] = 1;
        inputArray[5] = 5;
        inputArray[4] = 4;
        inputArray[3] = 3;
        System.out.println(Arrays.toString(inputArray));

        int searchValue = 5;
        //O(1)
        Integer result = inputArray[searchValue];
        System.out.println(result);

    }
}
