package ru;


public class TaskOneTwoTree {
    public static void main(String[] args) {

        int [] arr = {1, 2, 6, 3, 4};
        int [] arr2 = {0, 2, 0, 3, 4};
        System.out.println(countEvens(arr));
        System.out.println(countEvens(arr2));
        System.out.println(findMinMax(arr2));
        System.out.println(findTrue(arr2));

    }

    static int countEvens(int[] arr) {
        int counteven = 0;
        for (int item : arr) {
            if (item % 2 == 0)
                counteven++;
        }
        return counteven;
    }

    static int findMinMax(int[] arr){
        int minElement = arr[0];
        int maxElement = arr[0];
        for (int item: arr) {
            if (item < minElement)
                minElement = item;
            else if (item > maxElement) {
                maxElement = item;
            }
        }
         return (maxElement - minElement);
    }

    static boolean findTrue(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == 0 && arr[i+2] == 0)
                return true;
        }
        return false;
    }


}


