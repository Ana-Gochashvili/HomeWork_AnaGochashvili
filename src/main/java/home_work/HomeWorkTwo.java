package home_work;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWorkTwo {

    public static void main(String[] args) {

        // დავალება 1

        for (int i = 0; i <= 30; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }

        // or

        for (int i = 1; i < 30; i += 2) {
            System.out.println(i);
        }


        // დავალება 2

        for (int i = 0; i <= 10; i++) {
            System.out.println("Random number " + i + ": " + (Math.random() * 100));
        }

        // დავალება 3

        double[] myDoubleArray = {2.55, 5.32, 116, 9.88, 42.7, 35.12};
        double sum = 0;
        for (double d : myDoubleArray) {
            sum += d;
        }
        double average = sum / myDoubleArray.length;
        System.out.println("Average = " + average);
        System.out.println("Rounded average = " + Math.round(average));


        // დავალება 4

        int[] myNumbers = {45, 78, 6, 10, 37, 1030, 15, 1, 94, -150, 0, 11};
        int minNumber = myNumbers[0];
        for (int myNumber : myNumbers) {
            if (myNumber < minNumber)
                minNumber = myNumber;
        }
        System.out.println("MinNumber: " + minNumber);


        // with ArrayList

        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 91; i <= 100; i++){
            myList.add((int)(Math.random() * i));
        }
        System.out.println("Original ArrayList: " + myList);

        Collections.sort(myList);
        System.out.println("Sorted ArrayList: " + myList);
        System.out.println("MinNumber: " + myList.get(0));
    }
}
