package Shape;

public class SHAPESFACTORY {

    public Shapes getShapes(String type){
        switch(type){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
                default:
                    return null;
        }
    }
}
