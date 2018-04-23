package exercises.shapes;

public class Square extends Shape {
    private static int vertices = 4;
    private static int edges = 4;
    private double side;

    public Square(double aSide){
        side = aSide;
        area = side * side;
    }

    public double getSide(){
        return side;
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

    public void setSide(double aSide){
        side = aSide;
        area = side * side;
    }
}
