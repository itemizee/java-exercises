package exercises.shapes;

public class shapestest {
    public static void main(String[] args){

        Circle c = new Circle(3);
        Rectangle r = new Rectangle(3,4);
        Square s = new Square(2);

        System.out.println("\nCircle: \n" +
                "\nID: " + c.getID() +
                "\nArea: " + c.getArea() +
                "\nRadius: " + c.getRadius() +
                "\nDiameter: " + c.getDiameter() +
                "\nCircumference: " + c.getCircumference());

        c.setRadius(5);
        System.out.println("\nCircle: \n" +
                "\nID: " + c.getID() +
                "\nArea: " + c.getArea() +
                "\nRadius: " + c.getRadius() +
                "\nDiameter: " + c.getDiameter() +
                "\nCircumference: " + c.getCircumference());

        System.out.println("\nRectangle: \n" +
                "\nID: " + r.getID() +
                "\nArea: " + r.getArea() +
                "\nLength: " + r.getLength() +
                "\nWidth: " + r.getWidth() +
                "\nVertices: " + r.getVertices() +
                "\nEdges: " + r.getEdges());

        r.setLength(10);
        r.setWidth(3);
        System.out.println("\nRectangle: \n" +
                "\nID: " + r.getID() +
                "\nArea: " + r.getArea() +
                "\nLength: " + r.getLength() +
                "\nWidth: " + r.getWidth() +
                "\nVertices: " + r.getVertices() +
                "\nEdges: " + r.getEdges());

        System.out.println("\nSquare: \n" +
                "\nID: " + s.getID() +
                "\nArea: " + s.getArea() +
                "\nSide: " + s.getSide() +
                "\nVertices: " + s.getVertices() +
                "\nEdges: " + s.getEdges());

        s.setSide(9);
        System.out.println("\nSquare: \n" +
                "\nID: " + s.getID() +
                "\nArea: " + s.getArea() +
                "\nSide: " + s.getSide() +
                "\nVertices: " + s.getVertices() +
                "\nEdges: " + s.getEdges());



    }
}
