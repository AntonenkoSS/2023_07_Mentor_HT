package HT_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_sample{


   public static int[] getIntegers(int size){
       int[] ar = new int[size];

       for (int i = 0; i < size; i++) {
           System.out.println("Enter number: ");
           Scanner scanner = new Scanner(System.in);
           int num = scanner.nextInt();
           ar[i] = num;
       }

       return ar;
   }

   public static void printArray(int[] arr){
       for (int i = 0; i < arr.length; i++) {
           System.out.println(i +" element is - " + arr[i]);
       }
   }

    public static int[] sortIntegers(int[] arr){
       Arrays.sort(arr);   //сортировка в порядке возрастания
       reverse(arr);
       return arr;
    }

    private static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] =  tmp;
        }
    }

    private static int readInteger(){
        System.out.println("Enter the size of the ARRAY: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] readElements(int number){
       return getIntegers(number);
    }

    public static int findMin(int[] ar){
        int temp = ar[0];
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i+1]<ar[i]){
                temp = ar[i+1];
            }
        }
        return temp;
    }

//    public static int findMin(int[] arr){
//       return Arrays.stream(arr)
//                    .filter(Object::nonNull)
    //                .filter(s -> arr.length > 1)
    //                .min()
    //                .getAsInt();
//
//    }

    public static void main(String[] args) {
        //getIntegers(5);
        //sortIntegers(getIntegers(5));
        //printArray(sortIntegers(getIntegers(5)));

        printArray(sortIntegers(getIntegers(readInteger())));
        System.out.println("Minim element "+findMin(readElements(readInteger())));

    }

}
