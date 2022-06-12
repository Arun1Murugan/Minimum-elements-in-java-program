import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("PROGRAM TO FIND MINIMUM VALUE IN ARRAY.");
        System.out.println("Enter a count(i.e how many elements need to store in array.\r");
        int count = scanner.nextInt();
        int [] myArray = readIntegers(count);
//        int min = Integer.MAX_VALUE;
//        System.out.println("max value " + min);
        int minimumValue = findMinimumValue(myArray);
        System.out.println("Minimum value is :" + minimumValue);
//        int [] arr = new int[] {0,1,2,3,4,5,6,7};
//        System.out.println(arr.length);
        int maximumValue = findMaximumValue(myArray);
        System.out.println("Maximum value is :" + maximumValue);
    }
    public static int[] readIntegers(int number){

        int [] array = new int [number];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number :");
            int element = scanner.nextInt();
            array [i] = element;
        }
        return array;
    }
    private static int findMinimumValue(int [] array){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int value = array [i];
            if(value < minimum){
                minimum = value;
            }
        }
        return minimum;
    }
    private static int findMaximumValue(int [] array){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int value = array [i];
            if(value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }
}