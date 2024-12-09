package exam_one;

public class ExamOne {

    /* 42. დაწერეთ მეთოდი რომელიც იქნება მრავალჯერ გამოყენებადი, მეთოდმა უნდა შეადაროს ტოლია თუ არა გადაცემული მნიშვნელობები.
     მეთოდი გამოიძახეთ მეინ მეთოდში სამჯერ შემდეგი მნიშვნელობებით:
     1. 5 და 3
     2. 2 და 2
     3. 14 და 41 */

    public static boolean compareIntegers(int x, int y) {
        return x == y;
    }


    public static void main(String[] args) {

        // დავალება 41. დაბეჭდეთ “Hello World” 10-ჯერ ციკლის გამოყენებით

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }

        // დავალება 42
        System.out.println(compareIntegers(5, 3));
        System.out.println(compareIntegers(2, 2));
        System.out.println(compareIntegers(14, 41));


        // დავალება 43. ციკლის გამოყენებით დაბეჭდეთ მოცემული მასივის თითოეული ელემენტი.
        String[] cityArray = {"New York", "San Francisco", "Dallas", "Los Angeles", "Seattle"};

        for (String city : cityArray) {
            System.out.println("city = " + city);
        }


        /*  დავალება 45. იპოვეთ მოცემული მასივის მოდა
          Hint: მოდა არის მონაცემი რომელიც ყველაზე ხშირად გვხვდება მასივში
          ( თუ 2 ყველაზე ხშირად არსებული ელემენტი ერთიდაიგივე რაოდენობის არის შეგიძლიათ მაგას არ მიაქციოთ ყურადღება)*/

        int[] myArray = {0, 7, 7, 2, 7, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5, 3, 5};
        int count = 1;
        int x = myArray[0];
        int x1 = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            int count1 = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count1++;
                }
            }
            if (count1 > count) {
                x = myArray[i];
                count = count1;
            } else if (count1 == count) {
                x1 = myArray[i];
            }
        }
        System.out.println(x + " and " + x1);


    }

}
