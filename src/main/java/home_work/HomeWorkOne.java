package home_work;

public class HomeWorkOne {
    public static void main(String[] args) {

        // დავალება 1

        int number = 10;
        long longNumber = 20;
        double doubleNumber = 10.5;
        float floatNumber = 5.4f;
        boolean myBoolean = false;
        String myName = "Anna";
        char letter = 'a';

        System.out.println("First letter of " + myName + " is '" + letter + "'.");


        // დავალება 2

        int a = ++number;
        System.out.println(a);

        int b = a++;
        int c = a;
        myBoolean = a > b;
        boolean myBoolean1 = c > b;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", a > b == " + myBoolean + " and c > b == " + myBoolean1);

        float myFloat = floatNumber / 2;
        System.out.println("myFloat = " + myFloat + 'f');

        int remainder = 7 % 2;
        int myInt = 7 / 2;
        System.out.println("remainder = " + remainder + ", myInt = " + myInt);

        myInt +=remainder;
        System.out.println(myInt);

        myBoolean = myInt > remainder;
        System.out.println("myBoolean = " + myBoolean);

        myBoolean = c != b;
        System.out.println("myBoolean = " + myBoolean);

        myBoolean = c < b;
        System.out.println("myBoolean = " + myBoolean);

        // დავალება 3

        boolean logicalBoolean = number/2 >= 5 || longNumber/2 == number;
        System.out.println(logicalBoolean);

        boolean logicalBoolean2 = a == b && c != b;
        System.out.println(logicalBoolean2);

        boolean myLogicalBool = !(logicalBoolean == logicalBoolean2);
        System.out.println(myLogicalBool);


        // დავალება 4

        long myBirthYear = 1988;
        long currentYear = 2024;
        System.out.println("ჩემი დაბადების წელია " + myBirthYear + ", ჩემი ასაკია " + (currentYear - myBirthYear));

    }
}
