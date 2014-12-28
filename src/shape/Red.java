package shape;

/**
 * Created by water on 14-12-21.
 */
public class Red extends ShapeDecorator {
    public Red(Shape shape) {
        super(shape);
    }

    public void draw() {
        super.draw();
        System.out.println("with red color");
    }

}
