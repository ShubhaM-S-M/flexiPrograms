class Shape
{
    double area()
    {
        return 0;
    }

    double perimeter()
    {
        return 0;
    }
}

class Circle extends Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    double area()
    {
        return 3.14 * radius * radius;
    }

    double perimeter()
    {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape
{
    double length;
    double width;

    Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }

    double area()
    {
        return length * width;
    }

    double perimeter()
    {
        return 2 * (length + width);
    }
}

class Square extends Shape
{
    double side;

    Square(double s)
    {
        side = s;
    }

    double area()
    {
        return side * side;
    }

    double perimeter()
    {
        return 4 * side;
    }
}

public class ShapeDemo
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Square(3);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Circle Perimeter: " + s1.perimeter());

        System.out.println("Rectangle Area: " + s2.area());
        System.out.println("Rectangle Perimeter: " + s2.perimeter());

        System.out.println("Square Area: " + s3.area());
        System.out.println("Square Perimeter: " + s3.perimeter());
    }
}
