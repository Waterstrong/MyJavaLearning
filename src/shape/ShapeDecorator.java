package shape;

/**
 * Created by water on 14-12-21.
 */
public class ShapeDecorator extends Shape {

    private Shape shape;
//    public void setShape(Shape shape) {
//        this.shape = shape;
//    }

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw(){
        if (shape != null){
            shape.draw();
        }
    }
}
