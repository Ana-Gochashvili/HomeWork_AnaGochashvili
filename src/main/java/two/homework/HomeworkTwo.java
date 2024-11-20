package two.homework;

import java.util.ArrayList;
import java.util.Collections;



public class HomeworkTwo {


    // დავალება 1
    public static void getOddNumbers_1(int boundary) {
        for (int i = 0; i <= boundary; i++) {
            if (i % 2 != 0)
                System.out.print("Odd number: " + i + ", ");
        }
    }

    // or
    public static ArrayList<Integer> getOddNumbers_2(int boundary) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i < boundary; i += 2) {
            myList.add(i);
        }
        return myList;
    }


    // დავალება 2
    public static double getRandomNumber() {
        return Math.random() * 100;
    }


    // დავალება 3
    public static double getAverageOfArrayElements(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }


    // დავალება 4
    public static int getMinNumberOfArrayElements(int[] numbers) {
        int minNumber = numbers[0];
        for (int myNumber : numbers) {
            if (myNumber < minNumber)
                minNumber = myNumber;
        }
        return minNumber;
    }

    public static int getMinNumberOfArrayListElements(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        return list.get(0);
    }



    public static void main(String[] args) {

        //დავალება 1

        getOddNumbers_1(30);
        System.out.println("\nOdd numbers: " + getOddNumbers_2(30));


        // დავალება 2

        System.out.println("Random number: " + getRandomNumber());


        // დავალება 3

        double[] myDoubleArray = {2.5, 5, 116, 9, 42.1, 35, -7};
        System.out.println("Average = " + getAverageOfArrayElements(myDoubleArray));
        System.out.println("Rounded average = " + Math.round(getAverageOfArrayElements(myDoubleArray)));


        // დავალება 4

        int[] myNumbers = {45, 78, 6, 10, -37, 1030, 15, 1, 94, -150, 0, 11};
        System.out.println("MinNumber = " + getMinNumberOfArrayElements(myNumbers));


        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myList.add((int) (Math.random() * 100));
        }
        System.out.println("Original ArrayList: " + myList);

        System.out.println("MinNumber = " + getMinNumberOfArrayListElements(myList));

    }
}
