package abstraction;
//sub class

public class Circle extends Shape {

    int radius;

    @Override
    public int getArea() {
        //convert int - casting
        return (int) (3.14 * radius * radius);

    }
}
