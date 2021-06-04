package abstraction;

public class Abstraction {

    public static void main(String[] args) {
        //create objects
        Rectangle re = new Rectangle();
        Circle ci = new Circle();
        re.height = 10;
        re.length = 7;
        System.out.println("Rectangle Area is : - " + re.getArea());

        System.out.println(".......................");

        ci.radius = 7;
        System.out.println("Circle Area is : - " + ci.getArea());

    }

}
