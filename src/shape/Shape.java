package shape;

/**
 * Created by water on 14-12-27.
 */
public abstract class Shape {
    private float width;
    private float height;
    public Shape(float w, float h) {
        width = w;
        height = h;
    }

    public float getArea() {
        return this.width * this.height;
    }
}

