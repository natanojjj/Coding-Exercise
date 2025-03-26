import java.util.Arrays;

public class ArrayPractice{
    public static void main(String[] args){
        //Section 1: Array Creation
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3};
        boolean[] booleanArray = {true, false, true};
        char[] charArray = {'a','b','c'};

        System.out.println();
    
    }
    //Section 2: Array Return Types
    public static int[] getTwoNumbers(){ 
        return new int[] {5, 10}; //Anonymous Object
    }
    public static boolean[] getThreeBools(){
        return new boolean[] {true,false,true};
    }
    public static double[] getTwoDoubles(){
        return new double[] {1.5, 2.5};
    }

    //Section 3: Array Indexing
    public static int[] getFirstLast(int[] intArray){
        if(intArray.length == 0)
            return new int[] {}; //return empty if array is empty
        return new int[] {intArray[0], intArray[intArray.length - 1]};
    }
    public static char getMiddleChar(char[] charArray){
        if(charArray.length == 0)
            return '\0';
        return charArray[(charArray.length - 1)/2];
    }

    //Section 4: Array Manipulation
    public static void swapFirstLast(int[] intArray){
        int temp = intArray[0]; //set temporary to first index
        intArray[0] = intArray[intArray.length - 1]; //set first index to last
        intArray[intArray.length - 1] = temp; //set last to first (using temp)
    }
    public static int[] reverseArray(int[] intArray){
        if(intArray.length == 0)
            return intArray; //return original array if empty
        int[] reverse = new int[intArray.length];
        for(int i = 0; i < intArray.length; i++) //notice the string reverse and array reverse logic are sligtly different (dynamic vs static)
            reverse[i] = intArray[intArray.length - 1 - i]; //last index - i (iterating down the array)
        return reverse;
    }
}