package collection.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        inputArray[0] = 1;
        inputArray[1] = 5;
        inputArray[2] = 4;
        inputArray[3] = 3;
        System.out.println(Arrays.toString(inputArray));

        int searchValue = 8;
        //4번 반복 O(n)
        for (Integer inputValue : inputArray) {
            if(inputValue == searchValue){
                System.out.println(inputValue);
            }
        }

    }
}