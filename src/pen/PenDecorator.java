package pen;

/**
 * Created by water on 14-12-27.
 */
public class PenDecorator extends Pen {
    private Pen pen;
    public PenDecorator(Pen pen) {
        this.pen = pen;
    }

    public String draw() {
        if (this.pen != null){
            return this.pen.draw();
        }
        return null;
    }
}
