package exercises.shapes;

public class Circle extends Shape{
    private static double PI = 3.14159;
    private double radius;

    public Circle(double aRadius)
    {
        radius = aRadius;
        area = PI * (radius * radius);
    }

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getArea(){
        return area;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }

    public void setRadius(double aRadius){
        radius = aRadius;
        area = PI * (radius * radius);
    }

}
