import java.util.Arrays;

public class ArrayPractice{
    public static void main(String[] args){
        //Section 1: Array Creation
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.1, 2.2, 3.3};
        boolean[] booleanArray = {true, false, true};
        char[] charArray = {'a','b','c'};

        System.out.println(getTwoNumbers());
    
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
}