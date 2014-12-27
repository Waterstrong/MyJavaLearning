package shape;

/**
 * Created by water on 14-12-27.
 */
public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float w, float h) {
        this.width = w;
        this.height = h;
    }

    public float getArea() {
        return this.width * this.height;
    }
}
