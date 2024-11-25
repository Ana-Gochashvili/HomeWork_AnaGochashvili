package homework_3;


public class HomeworkThree {




    public static void main(String[] args) {

        int[] myNumbers = {45, 78, 6, 10, -37, 1030, 15, 1, 94, -150, 0, 11};
        double sum = 0;
        for (double d : myNumbers) {
            sum += d;
        }
        double average = sum / myNumbers.length;

        System.out.println(average);

    }
}
