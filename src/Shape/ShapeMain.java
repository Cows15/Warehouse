package Shape;

/*
FACTORY METHOD EXAMPLE
BY tommydates
 */

public class ShapeMain {



    public static void main(String[] args) {
        SHAPESFACTORY ss = new SHAPESFACTORY();

        //Circle
        ss.getShapes("circle").draw();

        //Square
        ss.getShapes("square").draw();

        //Rectangle
        ss.getShapes("rectangle").draw();

    }
}
