package abstraction;

//sub class
class Rectangle extends Shape {

    int length, height;

    @Override
    public int getArea() {
        return (length * height);
    }

}
