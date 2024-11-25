package exam_one;

public class ChildClassX extends ClassX{

    public static void main(String[] args) {
        ChildClassX myObj = new ChildClassX();

        System.out.println(myObj.calculateDiscountPrice(100, 5));
        System.out.println(myObj.calculateDiscountPrice(200, 10));
    }

}
