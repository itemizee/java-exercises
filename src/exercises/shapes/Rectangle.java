package exercises.shapes;

public class Rectangle extends Shape {
    private static int vertices = 4;
    private static int edges = 4;
    private double length;
    private double width;

    public Rectangle(double aLength, double aWidth)
    {
        length = aLength;
        width = aWidth;
        area = length * width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public int getVertices(){
        return vertices;
    }

    public int getEdges(){
        return edges;
    }

    public double getArea(){
        return area;
    }

    public void setLength(double aLength){
        length = aLength;
        area = length * width;
    }

    public void setWidth(double aWidth){
        width = aWidth;
        area = length * width;
    }
}
