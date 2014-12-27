package pen;

/**
 * Created by water on 14-12-27.
 */
public class Painter {
//    public String draw(Pen pen){
//        return pen.draw();
//    }

    public String draw(Pen pen, Color color) {
        return pen.draw()+" "+color.draw();
    }
}
